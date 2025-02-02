package lk.ecommerce.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//@Scope("prototype") tells Spring to create a new instance of the bean every time it is requested.
public class TestBean1 {
    public TestBean1() {
        System.out.println("TestBean Object Created");
    }
//    public void sayHi(){
//        System.out.println("Say Hi");
//    }
}
