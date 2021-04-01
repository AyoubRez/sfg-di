package shredder.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import shredder.springframework.sfgdi.services.GreetingService;

@Controller
public class ConstructorBasedController {
    private final GreetingService greetingService;

    public ConstructorBasedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
