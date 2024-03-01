package lk.ijse.gdse66.spring.bean;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWebMVC {
    public HelloWebMVC() {
        System.out.println("HelloWebMVC Instantiated...");
    }
    @GetMapping
    public String sayHello(){
        return "<h1>Hello Spring Web MVC</h1>";
    }

    @PostMapping
    public String sayHelloPost(){
        return  "Hello Spring Web MVC Post";
    }

    @DeleteMapping
    public String sayHelloDelete(){
        return  "Hello Spring Web MVC Delete";
    }

    @PatchMapping
    public String sayHelloPatch(){
        return  "Hello Spring Web MVC Patch";
    }

    @PutMapping
    public String sayHelloPut(){
        return  "Hello Spring Web MVC Put";
    }
}
