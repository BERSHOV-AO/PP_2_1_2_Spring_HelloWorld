import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        System.out.println("Сравнение двух бинов HelloWorld: " + (bean1 == bean2));

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.getMessage());
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat2.getMessage());

        System.out.println("Сравнение двух бинов Cat: " + (cat1 == cat2));
    }
}