package spring.course.domenico.dependency.injection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.course.domenico.dependency.injection.services.HelloWorldService;

/**
 * Created by domenico on 16/07/2017.
 */
//@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;
    private HelloWorldService helloWorldServiceGerman;
    private HelloWorldService helloWorldServiceFrench;

    public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench) {
        this.helloWorldServiceFrench = helloWorldServiceFrench;
    }

    public void setHelloWorldServiceGerman(HelloWorldService helloWorldServiceGerman) {
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello() {
        String greeting = helloWorldService.getGreeting();

        System.out.println(greeting);
        System.out.println(helloWorldServiceGerman.getGreeting());
        System.out.println(helloWorldServiceFrench.getGreeting());

        return greeting;
    }
}
