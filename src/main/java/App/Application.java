package App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"App.Controller", "App.Config", "App.Service"})
public class Application {
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
