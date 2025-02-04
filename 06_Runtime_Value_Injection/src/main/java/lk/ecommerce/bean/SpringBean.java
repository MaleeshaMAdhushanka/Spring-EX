package lk.ecommerce.bean;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//using run wena welawe value ekak daganna oni nam @Value annotation eka use karanawa
@Component
public class SpringBean implements InitializingBean {

    @Value("Mala")
    private String name;

//    public SpringBean(){
//        System.out.println(name);
//    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
    }


    //Argument wedima contructor eka ganne
    //parameter count eka wedima eka use karanne

//    public SpringBean(){}
//
//    @Autowired(required = false)
//    public SpringBean(@Value("kaleesha") String name,
//                      @Value("1")int id,
//                      @Value("true") boolean b,
//                      @Value("true") boolean c){
//        System.out.println("Spring Bean Object Created");
//        System.out.println("Name: " + name);
//        System.out.println("ID: " + id);
//        System.out.println("Boolean: " + b);
//        System.out.println("Boolean: " + c);
//
//    }
//
//    @Autowired(required = false)
//    public SpringBean(@Value("Maleesha") String name,
//                      @Value("1") int id,
//                      @Value("true") boolean b){
//        System.out.println("Spring Bean Object Created");
//        System.out.println("Name: " + name);
//        System.out.println("ID: " + id);
//        System.out.println("Boolean: " + b);
//
//    }
}
