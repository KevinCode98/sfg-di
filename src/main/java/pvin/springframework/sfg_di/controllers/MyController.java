package pvin.springframework.sfg_di.controllers;

import org.springframework.stereotype.Controller;
import pvin.springframework.sfg_di.services.GreetingService;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
