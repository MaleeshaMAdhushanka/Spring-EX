package lk.ecommerce;

import lk.ecommerce.bean.MyConnection;
import lk.ecommerce.bean.SpringBean;
import lk.ecommerce.bean.TestBean1;
import lk.ecommerce.bean.TestBean2;
import lk.ecommerce.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        //siglotion application context ekata wtena obeject eka
        TestBean1 ref1 = context.getBean("testBean1", TestBean1.class);

        TestBean1 ref2 = context.getBean("testBean1", TestBean1.class);

        System.out.println(ref1);
        System.out.println(ref2);

        TestBean2 ref3 = context.getBean("testBean2", TestBean2.class);
        TestBean2 ref4 = context.getBean("testBean2", TestBean2.class);

        System.out.println(ref3);
        System.out.println(ref4);


        MyConnection ref5 = context.getBean("connection", MyConnection.class);
        MyConnection ref6 = context.getBean("connection", MyConnection.class);

        System.out.println(ref5);
        System.out.println(ref6);

//        TestBean1 testBean1 = context.getBean(TestBean1.class);
//        System.out.println(testBean1);

//        TestBean2 testBean2 = (TestBean2) context.getBean("testBean2");
//        System.out.println(testBean2);
        //or

//        TestBean2 testBean2 = context.getBean(TestBean2.class);
//        System.out.println(testBean2);

//        TestBean2 testBean2 = context.getBean("bean2",TestBean2.class);
//        System.out.println(testBean2);
        //bean eke componet ekata nama dila
//        TestBean2 testBean2 = context.getBean("testBean2", TestBean2.class);
//        System.out.println(testBean2);
//
//        MyConnection myConnection = context.getBean(MyConnection.class);
//        System.out.println(myConnection);
//
//       MyConnection reference1 = context.getBean(MyConnection.class);
//        System.out.println(reference1);
//
//        MyConnection reference2 = context.getBean(MyConnection.class);
//        System.out.println(reference2);

//        MyConnection reference2 = context.getBean(MyConnection.class);
//        System.out.println(reference2);



//        SpringBean bean = context.getBean(SpringBean.class);
//        System.out.println(bean);
//
//        bean.sayHello();
//        TestBean1 bean1  = context.getBean(TestBean1.class);
//        System.out.println(bean1);

//        bean1.sayHi();

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