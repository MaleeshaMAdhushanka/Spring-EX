package lk.ecommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//this is child context
@Configuration
@ComponentScan(basePackages = "lk.ecommerce.bean, lk.ecommerce.controller")
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {
 //third party library ekak nisa
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        //Web-INF/views/index.html
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".html");
        viewResolver.setOrder(2);
        return viewResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/WEB-INF/views/**")
                .addResourceLocations("/WEB-INF/views/");
    }
}
