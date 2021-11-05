package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        // Getting the application context
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);


        I18nController controller = (I18nController) ctx.getBean("i18nController");

        System.out.println("------------------------ profile");

        System.out.println(controller.sayHello());

        // Getting the MyController controller from the application context
        MyController myController = (MyController) ctx.getBean("myController");//Casting to MyController

        //Calling The sayHello() methode in the MyController
        //String greeting = myController.sayHello();
        System.out.println("------------------- Primary bean");
        //Printing the returned value to the console
        System.out.println(myController.sayHello());

        System.out.println("--------------------- Property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("--------------------- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());
        System.out.println("--------------------- Constructor");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());
    }

}
