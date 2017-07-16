package spring.course.domenico.dependency.injection.services;

/**
 * Created by domenico on 16/07/2017.
 */
public class HelloWorldServiceFrenchImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Bonjour tout le monde!!!";
    }
}
