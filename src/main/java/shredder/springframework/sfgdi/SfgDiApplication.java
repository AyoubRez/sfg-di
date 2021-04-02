package shredder.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import shredder.springframework.sfgdi.controllers.*;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx= SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController") ;

        System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("---------------------Property injection");

		PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");

		greeting = propertyInjectionController.getGreeting();

		System.out.println(greeting);

		System.out.println("---------------------Setter Based injection");

		SetterBasedController setterBasedController = (SetterBasedController) ctx.getBean("setterBasedController");

		greeting = setterBasedController.getGreeting();

		System.out.println(greeting);

		System.out.println("---------------------Constructor Based injection");

		ConstructorBasedController constructorBasedController = (ConstructorBasedController) ctx.getBean("constructorBasedController");

		greeting = constructorBasedController.getGreeting();

		System.out.println(greeting);
	}

}
