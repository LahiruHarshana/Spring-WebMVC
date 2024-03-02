package lk.ijse.gdse66.spring.bean;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

//@Component
public class SpringBean implements BeanNameAware, InitializingBean, DisposableBean, BeanFactoryAware, ApplicationContextAware {
    public SpringBean() {
        System.out.println("Spring Bean Instantiated...");
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware...");

    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name Aware...");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean Destroyed...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Properties Set...");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware...");
    }
}
