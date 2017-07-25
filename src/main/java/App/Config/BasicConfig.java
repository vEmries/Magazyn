package App.Config;

import App.Service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:Config/WarehouseConfig.xml")
public class BasicConfig {

    @Bean
    ProductService productService() {
        return new ProductService();
    }
}
