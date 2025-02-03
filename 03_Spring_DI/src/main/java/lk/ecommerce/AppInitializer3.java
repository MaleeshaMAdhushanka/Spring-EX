package lk.ecommerce;

import lk.ecommerce.Config.AppConfig;
import lk.ecommerce.bean.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppInitializer3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

         Boy boy =  context.getBean(Boy.class);
        System.out.println(boy);

        boy.chatWithGirl();

        context.registerShutdownHook();
    }
}