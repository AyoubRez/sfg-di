package shredder.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shredder.springframework.sfgdi.services.ConstructorGreetingService;

class ConstructorBasedControllerTest {
    ConstructorBasedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorBasedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}