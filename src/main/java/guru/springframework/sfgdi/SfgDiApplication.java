package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        // Getting the application context
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        // Getting the MyController controller from the application context
        MyController myController = (MyController) ctx.getBean("myController");//Casting to MyController

        //Calling The sayHello() methode in the MyController
        String greeting = myController.sayHello();

        //Printing the returned value to the console
        System.out.println(greeting);
    }

}
