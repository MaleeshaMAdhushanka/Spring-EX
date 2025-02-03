package lk.ecommerce.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test2 implements DIInterface {
//    private DI test1;

    DI test1;

//    @Autowired
//    public Test2(Test1 test1) {
//        this.test1 = test1;
//    }
//    DI test1;


//    public Test2(){
//        System.out.println("Test2 object created");
//    }

    //setter method

    @Autowired
    public void setTest1(DI test1){
       this.test1 = test1;
    }
    public void display(){
       test1.seyHello();
    }


    @Override
    public void inject(DI test1) {
        this.test1 = test1;
    }
}
