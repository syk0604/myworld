package canal.adapter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Administrator
 * 2021/4/26
 */
public class SystemCurrentTimeToDayAdapter {
    public static void main(String[] args) {
//        long l = System.currentTimeMillis();
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
        String format = sf.format(new Date());
        System.out.println(format);
        SimpleDateFormat sf1 = new SimpleDateFormat("HH");
        String format1 = sf1.format(new Date());
        System.out.println(format1);
    }
}
