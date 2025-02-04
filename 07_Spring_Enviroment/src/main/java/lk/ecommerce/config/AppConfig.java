package lk.ecommerce.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan (basePackages = "lk.ecommerce.bean")
@PropertySource("classpath:application.properties")
public class AppConfig {
}
