package spring.course.domenico.dependency.injection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by domenico on 16/07/2017.
 */
public class HelloWorldServiceSpanishImpl implements HelloWorldService{
    @Override
    public String getGreeting() {
        return "Hola mundo!!!";
    }
}
