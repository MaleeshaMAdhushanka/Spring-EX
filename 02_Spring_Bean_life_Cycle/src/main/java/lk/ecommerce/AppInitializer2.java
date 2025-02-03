package lk.ecommerce;

import lk.ecommerce.bean.MyConnection;
import lk.ecommerce.bean.SpringBean;
import lk.ecommerce.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppInitializer2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(AppConfig.class);
        context.refresh();

        MyConnection myConnection1 = context.getBean(MyConnection.class);
        System.out.println("------------------------");
        MyConnection myConnection2 = context.getBean(MyConnection.class);
//        System.out.println(myConnection1);
//        System.out.println(myConnection2);

//       SpringBean bean1 = context.getBean(SpringBean.class);
//       SpringBean bean2 = context.getBean(SpringBean.class);
//
//        System.out.println(bean1);
//        System.out.println(bean2);
//       MyConnection myConnection1 = context.getBean(MyConnection.class);
//       MyConnection myConnection2 = context.getBean(MyConnection.class);
//
//        System.out.println(myConnection1);
//        System.out.println(myConnection2);
        context.registerShutdownHook();

    }
}