package App.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:Config/WarehouseConfig.xml")
public class BasicConfig {
}
