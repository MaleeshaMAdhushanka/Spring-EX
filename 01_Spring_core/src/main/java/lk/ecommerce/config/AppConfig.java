package lk.ecommerce.config;

import lk.ecommerce.bean.MyConnection;
import org.springframework.context.annotation.*;

// Application context ekata adalwa thiyena bean tika wetenne kohomada kiyala define karana eka
@Configuration
@ComponentScan(basePackages = "lk.ecommerce.bean")
public class AppConfig {
   //@Bean is used to explicitly declare a bean in a Spring configuration class.
//   For third-party libraries or classes that don’t have Spring annotations (like @Component).
    @Bean("connection")//This registers the MyConnection object as a Spring bean with the name "connection"

    @Scope("prototype") //This tells Spring to create a new instance of MyConnection every time it is requested.
    MyConnection getConnection(){
        return new MyConnection();
    }


}
