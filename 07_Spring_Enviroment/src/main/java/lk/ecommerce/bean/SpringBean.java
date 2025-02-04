package lk.ecommerce.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {

    @Value("${os.name}")
    private String osName;

    @Value("${USERDOMAIN}")
    private String longName;

    @Value("${database.user}")
    private String user;

    @Value("${db.URL}")
    private String url;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("OS Name : " +osName);
        System.out.println("Long Name : " +longName);
        System.out.println("User Name : " + user);
        System.out.println("URL : "+url);
    }
}
