import java.util.concurrent.TimeUnit;

/**
 * Administrator
 * 2021/4/8
 */
public class Demo implements Runnable{
    public static void main(String[] args) throws Exception {
//        String str = "2021-04-07 122334";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        String format = simpleDateFormat.format(new Date());
//        Date parse = simpleDateFormat.parse(format);
//        long time = parse.getTime();
//        String s = String.valueOf(time);
//        System.out.println(s);
////                String format = simpleDateFormat.format(new Date());
//        System.out.println(format);
//        long timeInMillis = Calendar.getInstance().getTimeInMillis();
//        String arg1 = String.valueOf(timeInMillis);
//        System.out.println(arg1);
        char a=194;
        System.out.println(a);
        synchronized(Demo.class){
            System.out.println();
        }
    }

    @Override
    public void run() {

    }
}
