package UserSystemStack.BusinessTier.Server.WebAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApiMain {
    public static void main(String[] args) {
        SpringApplication app = new org.springframework.boot.SpringApplication(WebApiMain.class);
        app.setAdditionalProfiles("WebApiMain");
        app.run(args);
    }
}
