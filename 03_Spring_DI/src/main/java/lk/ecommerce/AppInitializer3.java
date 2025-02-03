package lk.ecommerce;

import lk.ecommerce.Config.AppConfig;
import lk.ecommerce.bean.Boy;
import lk.ecommerce.di.Test1;
import lk.ecommerce.di.Test2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppInitializer3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//         Boy boy =  context.getBean(Boy.class);
//        System.out.println(boy);
//
//        boy.chatWithGirl();

//        Test1 test1 = context.getBean(Test1.class);
//        System.out.println(test1);
//
//        test1.seyHello();

        Test2 test2 = context.getBean(Test2.class);
        test2.display();

        context.registerShutdownHook();
    }
}