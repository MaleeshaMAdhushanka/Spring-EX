package lk.ecommerce;

import lk.ecommerce.bean.SpringBean;
import lk.ecommerce.bean.TestBean;
import lk.ecommerce.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        SpringBean bean = context.getBean(SpringBean.class);
        System.out.println(bean);

        bean.sayHello();
        TestBean bean1  = context.getBean(TestBean.class);
        System.out.println(bean1);

        bean1.sayHi();

        //jvm eka shutdown weddi thamai context eka close wenne

//        Runtime.getRuntime().addShutdownHook(new Thread(){
//            @Override
//            public void run() {
//                System.out.println("Shutting down...");
//                context.close();
//            }
//        });

//        context.close();
        context.registerShutdownHook();
    }
}