import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("my-config.xml");
        //все бины инициализировались

        HelloWorld bean = (HelloWorld) context.getBean("произвольноеназвание");
        //context.getBean тоже самое что создать объект

        System.out.println(bean.getName());


        ApplicationContext acontext = new AnnotationConfigApplicationContext(HelloWorldAnnotation.class);
        HelloWorldAnnotation helloWorldAnnotation = acontext.getBean(HelloWorldAnnotation.class);
        helloWorldAnnotation.message();


    }
}