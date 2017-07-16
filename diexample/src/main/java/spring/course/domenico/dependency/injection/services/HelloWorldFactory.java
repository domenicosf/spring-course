package spring.course.domenico.dependency.injection.services;

/**
 * Created by domenico on 16/07/2017.
 */
public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String language){

        HelloWorldService service = null;
        switch(language){
            case "en":
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "es":
                service = new HelloWorldServiceSpanishImpl();
                break;
            case "fr":
                service = new HelloWorldServiceFrenchImpl();
                break;
            case "de":
                service = new HelloWorldServiceGermanImpl();
                break;
            case "it":
                service = new HelloWorldServiceItalianImpl();
                break;
            case "pl":
                service = new HelloWorldServicePolishImpl();
                break;
            case "ru":
                service = new HelloWorldServiceRussianImpl();
                break;
            default: service = new HelloWorldServiceEnglishImpl();
        }

        return service;
    }
}
