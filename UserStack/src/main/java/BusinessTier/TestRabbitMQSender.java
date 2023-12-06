package BusinessTier;

import BusinessTier.RabbitMQ.BusinessSender;
import Shared.DTOs.UserInfoDto;

public class TestRabbitMQSender {
    public static void main(String[] args) {
        UserInfoDto user = new UserInfoDto("Mathias", "331199@via.dk", "12345678");

        try {
            BusinessSender.sendUserInfoDto(user);
            BusinessSender.sendUserVerifiedMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
