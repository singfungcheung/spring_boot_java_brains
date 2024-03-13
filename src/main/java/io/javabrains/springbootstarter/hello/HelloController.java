package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // This means we can have methods that map to a certain URL request made by the user.
    @RequestMapping("/hello")
    public String sayHi() {
        return "Hello World!";
    }

    @RequestMapping("/bruh")
    public String sayBruh(){
        return "BRUHH";
    }
}
