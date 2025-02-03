package lk.ecommerce.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyConnection implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public MyConnection(){
        System.out.println("MyConnection () Object Created");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("My Connection Bean Factory set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("My Connection Bean Name set");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("My Connection Destroying Bean");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("My Connection Initializing Bean");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("My Connection Application Context set");
    }
}
