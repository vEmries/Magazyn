package App.Config;

import App.Service.ProductService;
import App.Service.ShipmentService;
import App.Service.ShipperService;
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

    @Bean
    ShipmentService shipmentService() {
        return new ShipmentService();
    }

    @Bean
    ShipperService shipperService() {
        return new ShipperService();
    }
}
