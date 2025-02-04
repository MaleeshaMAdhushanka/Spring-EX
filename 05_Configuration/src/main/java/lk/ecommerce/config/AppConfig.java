package lk.ecommerce.config;

import lk.ecommerce.bean.SpringBean;
import lk.ecommerce.bean.SpringBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//menn me package ekata gihin menna me bean eka scan lranna kiyala kiyanna
//@Configuration
//@ComponentScan(basePackages = "lk.ecommerce.bean")
//eka config ekak ethule anith eka call wenawa

//eka xml file eka import karanna  project root eke
//@ImportResource("classpath:beans.xml")
//ehema nethnm
//@ImportResource("file:abosulete-path-of-beans.xml")
@Configuration
@Import({AppConfig1.class, AppConfig2.class})
public class AppConfig {

    @Bean
    public SpringBean1 springBean1(){
        return  new SpringBean1();
    }


}
