package lk.ecommerce;

import lk.ecommerce.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppInitializer8 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//        Map<String, String> getenv = System.getenv();
//        for (String key : getenv.keySet()){
//            System.out.println(key + " : " + getenv.get(key));
//        }

        //java Predefine properties
        Properties properties = System.getProperties();
        for (String key : properties.stringPropertyNames()){
            System.out.println(key + " : " + properties.getProperty(key));
        }

//        String osName = System.getProperty("os.name");
//        System.out.println("osName = " + osName);
//



        context.registerShutdownHook();
    }
}