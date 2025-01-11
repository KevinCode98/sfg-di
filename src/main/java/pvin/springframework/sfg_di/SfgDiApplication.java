package pvin.springframework.sfg_di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pvin.springframework.sfg_di.controllers.*;
import pvin.springframework.sfg_di.services.PrototypeBean;
import pvin.springframework.sfg_di.services.SingletonBean;

@ComponentScan(basePackages = {"pvin.springframework.sfg_di", "com.springframework.pets"})
@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        PetController petController = ctx.getBean("petController", PetController.class);
        System.out.println("----- Best pet");
        System.out.println(petController.whichPetIsTheBest());

        System.out.println("----- I18nController");
        I18nController i18nController = ctx.getBean(I18nController.class);
        System.out.println(i18nController.sayHello());

        MyController controller = (MyController) ctx.getBean("myController");
        System.out.println("----- Primary Bean");
        System.out.println(controller.sayHello());

        System.out.println("----- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("----- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("----- Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("----- Singleton Bean");
        SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean1.getMyScope());

        SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean2.getMyScope());


        System.out.println("----- Prototype Bean");
        PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getMyScope());

        PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean2.getMyScope());
    }
}
