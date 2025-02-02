package lk.ecommerce.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("testBean2")
@Component()
@Scope("prototype")
public class TestBean2 {
    public TestBean2() {
        System.out.println("TestBean2 object created");
    }
}
