package UserSystemStack.BusinessTier.Server.WebAPI;

import UserSystemStack.BusinessTier.Server.RabbitMQ.BusinessReceiver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebApiMain {
    public static void main(String[] args) {
        SpringApplication app = new org.springframework.boot.SpringApplication(WebApiMain.class);
        app.setAdditionalProfiles("WebApiMain");
        ApplicationContext context = app.run(args);

        BusinessReceiver businessReceiver = context.getBean(BusinessReceiver.class);


        try {
            businessReceiver.startReceiving();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
