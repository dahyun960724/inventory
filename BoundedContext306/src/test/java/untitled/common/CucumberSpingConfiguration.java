package untitled.common;


import untitled.BoundedContext306Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext306Application.class })
public class CucumberSpingConfiguration {
    
}
