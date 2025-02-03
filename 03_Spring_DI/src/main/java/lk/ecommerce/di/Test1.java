package lk.ecommerce.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Test1 implements DI {
    public Test1(){
        System.out.println("Test 1 constructor");
    }

    @Override
    public void seyHello() {
        System.out.println("Hello from Test 1");
    }
}
