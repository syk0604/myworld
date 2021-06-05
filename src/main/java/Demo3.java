import org.w3c.dom.ls.LSOutput;

/**
 * Administrator
 * 2021/5/26
 */
public class Demo3 implements Runnable{
    int a = 0;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            a++;
            System.out.println(a);
            Thread.currentThread().interrupt();
            System.out.println(Thread.currentThread().isInterrupted());
            System.out.println("interrupt后的值"+a);


        }

    }
}
