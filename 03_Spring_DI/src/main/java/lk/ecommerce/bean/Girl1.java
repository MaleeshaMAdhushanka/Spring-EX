package lk.ecommerce.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//Primary annotation eka dala thiyenne dependancy  widiyata inject karaganna kiyala
public class Girl1 implements Agreement {
    public Girl1(){
        System.out.println("Girl  1 Constructor");
    }

    @Override
    public void chat() {
        System.out.println("girl 1 chatting");
    }


//    public void chat(){
//        System.out.println("Chatting with ......");
//    }
}
