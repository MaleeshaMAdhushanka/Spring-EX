package lk.ecommerce;

import lk.ecommerce.bean.SpringBeanOne;
import lk.ecommerce.bean.SpringBeanTwo;
import lk.ecommerce.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppInitializer4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

      SpringBeanOne bean = context.getBean(SpringBeanOne.class);
        System.out.println(bean);
        SpringBeanOne bean2 = context.getBean(SpringBeanOne.class);
        System.out.println(bean2);


        SpringBeanTwo bean3 = context.getBean(SpringBeanTwo.class);
        System.out.println(bean3);

        SpringBeanTwo bean4 =context.getBean(SpringBeanTwo.class);
        System.out.println(bean4);



        context.registerShutdownHook();

    }
}