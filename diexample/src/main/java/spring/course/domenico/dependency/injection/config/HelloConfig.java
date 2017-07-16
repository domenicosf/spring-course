package spring.course.domenico.dependency.injection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import spring.course.domenico.dependency.injection.services.HelloWorldFactory;
import spring.course.domenico.dependency.injection.services.HelloWorldService;
import spring.course.domenico.dependency.injection.services.HelloWorldServiceEnglishImpl;
import spring.course.domenico.dependency.injection.services.HelloWorldServiceSpanishImpl;

/**
 * Created by domenico on 16/07/2017.
 */
@Configuration
public class HelloConfig {

    /*
    @Bean
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }*/

    /*
    @Bean
    @Profile("english")
    @Primary
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory){
        return factory.createHelloWorldService("en");
    }*/

    /*
    @Bean
    @Profile("spanish")
    @Primary
    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory){
        return factory.createHelloWorldService("es");
    }*/

    /*
    @Bean
    public HelloWorldService helloWorldServiceGerman(HelloWorldFactory factory){
        return factory.createHelloWorldService("de");
    }*/

    /*
    @Bean(name="french")
    public HelloWorldService helloWorldServiceFrench(HelloWorldFactory factory){
        return factory.createHelloWorldService("fr");
    }*/

    /*
    @Bean
    public HelloWorldService helloWorldServiceItalian(HelloWorldFactory factory){
        return factory.createHelloWorldService("it");
    }

    @Bean
    public HelloWorldService helloWorldServicePolish(HelloWorldFactory factory){
        return factory.createHelloWorldService("pl");
    }

    @Bean
    public HelloWorldService helloWorldServiceRussian(HelloWorldFactory factory){
        return factory.createHelloWorldService("ru");
    }*/

}
