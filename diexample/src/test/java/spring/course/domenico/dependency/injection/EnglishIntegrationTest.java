package spring.course.domenico.dependency.injection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.course.domenico.dependency.injection.services.HelloWorldService;

import static org.junit.Assert.assertEquals;

/**
 * Created by domenico on 16/07/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/helloworld-config.xml",
 "classpath:/spring/english-hello-world.xml"})
public class EnglishIntegrationTest {

    @Autowired
    HelloWorldService helloWorldService;

    @Test
    public void testHelloWorld(){
        String greeting = helloWorldService.getGreeting();

        assertEquals("Hello World!!!", greeting);
    }
}
