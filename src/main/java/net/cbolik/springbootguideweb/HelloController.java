package net.cbolik.springbootguideweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from the updated and now even cooler Spring Boot Web demo app!\n";
    }

}