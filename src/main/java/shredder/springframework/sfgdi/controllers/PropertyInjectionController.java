package shredder.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import shredder.springframework.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectionController {

    @Autowired
    @Qualifier("propertyGreetingService")
    public GreetingService  greetingService;

    public String getGreeting(){
         return greetingService.sayGreeting();
    }
}
