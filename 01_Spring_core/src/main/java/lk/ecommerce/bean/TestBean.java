package lk.ecommerce.bean;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
    public TestBean() {
        System.out.println("TestBean Object Created");
    }
    public void sayHi(){
        System.out.println("Say Hi");
    }
}
