import com.gupaoedu.Myconfig.Myconfig;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Administrator
 * 2021/4/14
 */
public class Demo2 {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(Myconfig.class);
        app.getBean("person");
    }
}
