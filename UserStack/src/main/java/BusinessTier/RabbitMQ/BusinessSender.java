package BusinessTier.RabbitMQ;

import Shared.DTOs.UserInfoDto;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class BusinessSender {
    private final static String EXCHANGE_NAME = "UserInfoExchange";
    private final static String ROUTING_KEY = "UserInfoRouting";

    public static void sendUserInfoDto(UserInfoDto user) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost"); // RabbitMQ server address

        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.exchangeDeclare(EXCHANGE_NAME, "direct");
            byte[] message = deserializeUser(user);
            channel.basicPublish(EXCHANGE_NAME, ROUTING_KEY, null, message);
            System.out.println(" [x] Sent '" + user + "'");
        }
    }

    private static byte[] deserializeUser(UserInfoDto user) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String jSon = mapper.writeValueAsString(user);
            return jSon.getBytes();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sendUserVerifiedMessage() {

    }
}

