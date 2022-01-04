import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanHelloFirst = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHelloFirst.getMessage());
        HelloWorld beanHelloSecond = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHelloSecond.getMessage());
        System.out.println(beanHelloFirst == beanHelloSecond);

        System.out.println("---------------------------");

        Cat beanCatFirst = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCatFirst.getMessage());
        Cat beanCatSecond = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCatSecond.getMessage());
        System.out.println(beanCatFirst == beanCatSecond);
    }
}