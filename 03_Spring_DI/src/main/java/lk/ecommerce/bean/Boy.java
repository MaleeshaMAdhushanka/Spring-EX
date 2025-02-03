package lk.ecommerce.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {
//    @Autowired
//    Girl1 girl1;
//When you have multiple beans of the same type, Spring doesn't know which one to inject. In this case, you can use the @Qualifier annotation to specify the exact bean to be injected.
    @Qualifier("girl1")
    @Autowired
    Agreement girl;
    //Object eka mekata initialize wela nh
//    ethalota e part eka kare Autowired annotation eka
    public Boy(){
        System.out.println("Boy Constructor");
    }
    public void chatWithGirl(){
//        Girl1 girl = new Girl1();
        girl.chat();
    }

}
