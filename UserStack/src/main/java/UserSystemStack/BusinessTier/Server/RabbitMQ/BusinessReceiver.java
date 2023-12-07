package UserSystemStack.BusinessTier.Server.RabbitMQ;

import UserSystemStack.BusinessTier.Application.DAOs.Interfaces.IUserInfoDao;
import UserSystemStack.BusinessTier.Application.DAOs.UserDao;
import com.rabbitmq.client.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;


@Component
public class BusinessReceiver {

    private static final String QUEUE_NAME = "UserInfoQueue";
    private static final String EXCHANGE_NAME = "UserInfoExchange";
    private static final String ROUTING_KEY = "UserInfoRouting";

    IUserInfoDao userInfoDao;

    @Autowired
    public BusinessReceiver(IUserInfoDao userDao) {
        this.userInfoDao = userDao;
    }

    public void startReceiving() throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");

        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "direct");
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, ROUTING_KEY);

        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = deserializeUser(delivery.getBody());
            System.out.println(" [x] Received '" + message + "'");

            AMQP.BasicProperties replyProps = new AMQP.BasicProperties
                    .Builder()
                    .correlationId(delivery.getProperties().getCorrelationId())
                    .build();

            String response;

            if(validateUser(message)){
                System.out.println("User is valid");
                response = message;
            } else {
                System.out.println("User is not valid");
                response = "NotValidUser";
            }

            channel.basicPublish("", delivery.getProperties().getReplyTo(), replyProps, response.getBytes(StandardCharsets.UTF_8));
        };

        channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> { });
    }

    public boolean validateUser(String message) {
        return userInfoDao.userExists(message);
    }

    public String deserializeUser(byte[] message) {
        String result = new String(message, StandardCharsets.UTF_8);
        if (result.startsWith("\"") && result.endsWith("\"")) {
            return result.substring(1, result.length() - 1);
        }
        return result;
    }

}