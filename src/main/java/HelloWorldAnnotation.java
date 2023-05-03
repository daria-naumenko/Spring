import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldAnnotation {

    // @Bean(name = "message")
    public void message() {
        System.out.println("Hello World with Annotation");
    }
}