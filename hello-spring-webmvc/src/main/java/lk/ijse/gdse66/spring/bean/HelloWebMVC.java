package lk.ijse.gdse66.spring.bean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWebMVC {
    public HelloWebMVC() {
        System.out.println("HelloWebMVC Instantiated...");
    }

    @GetMapping
    public void sayHello(){
        System.out.println("Hello Spring Web MVC");
    }
}
