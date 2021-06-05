import java.awt.font.TextHitInfo;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Administrator
 * 2021/4/8
 */
public class Demo1 {
    private Integer id;
    private String name;
    private String sex;


    public static void main(String[] args) {

        Thread thread = new Thread(new Demo3());

        thread.start();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        boolean interrupted = thread.isInterrupted();
//        System.out.println(interrupted);
//        thread.interrupt();
//        System.out.println("ddd"+thread.isInterrupted());
    }
}
