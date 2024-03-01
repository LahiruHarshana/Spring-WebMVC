package lk.ijse.gdse66.spring.bean;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebMVC {
    public HelloWebMVC() {
        System.out.println("HelloWebMVC Instantiated...");
    }
}
