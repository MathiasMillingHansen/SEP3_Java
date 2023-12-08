package UserSystemStack.BusinessTier.Server.RabbitMQ;

import UserSystemStack.BusinessTier.Application.Logic.Interfaces.IUserInfoLogic;
import UserSystemStack.Shared.DTOs.UserInfoDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;


@Component
public class BusinessReceiver {

    private static final String EXCHANGE_NAME = "UserInfoExchange";
    private static final String QUEUE_NAME = "UserInfoQueue";
    private static final String ROUTING_KEY_SEND = "UserInfoRouting.Send";
    private static final String ROUTING_KEY_GET = "UserInfoRouting.Get";

    IUserInfoLogic userInfoLogic;

    @Autowired
    public BusinessReceiver(IUserInfoLogic userInfoLogic) {
        this.userInfoLogic = userInfoLogic;
    }

    public void startReceiving() throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "direct");
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, ROUTING_KEY_SEND);
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, ROUTING_KEY_GET);

        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = deserializeUser(delivery.getBody());
            System.out.println(" [x] Received '" + delivery.getEnvelope().getRoutingKey() + "':'" + message + "'");

            AMQP.BasicProperties replyProps = new AMQP.BasicProperties
                    .Builder()
                    .correlationId(delivery.getProperties().getCorrelationId())
                    .build();

            if (delivery.getEnvelope().getRoutingKey().equals(ROUTING_KEY_SEND)) {
                String response = processSendMessage(message);
                channel.basicPublish("", delivery.getProperties().getReplyTo(), replyProps, response.getBytes(StandardCharsets.UTF_8));
            } else if (delivery.getEnvelope().getRoutingKey().equals(ROUTING_KEY_GET)) {
                UserInfoDto userInfoDto = processGetUserInfoMessage(message);
                channel.basicPublish("", delivery.getProperties().getReplyTo(), replyProps, serializeUserInfo(userInfoDto).getBytes(StandardCharsets.UTF_8));

            }

        };

        channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> { });
    }

    private UserInfoDto processGetUserInfoMessage(String message) {
        return userInfoLogic.getUserInformation(message);
    }

    private String processSendMessage(String message) {
        String response;
        if(validateUser(message)){
            System.out.println("User is valid");
            response = message;
        } else {
            System.out.println("User is not valid");
            response = "NotValidUser";
        }
        return response;
    }

    public boolean validateUser(String message) {
        return userInfoLogic.userExists(message);
    }

    public String deserializeUser(byte[] message) {
        String result = new String(message, StandardCharsets.UTF_8);
        if (result.startsWith("\"") && result.endsWith("\"")) {
            return result.substring(1, result.length() - 1);
        }
        return result;
    }

    private String serializeUserInfo(UserInfoDto userInfoDto) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(userInfoDto);
        } catch (Exception e) {
            throw new RuntimeException("Error serializing UserInfoDto", e);
        }
    }


}