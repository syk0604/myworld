package canal.adapter;

/**
 * Administrator
 * 2021/4/26
 */
public class LinefeedConversionAdapter {
    public static void main(String[] args) {
        String str = "syk\r\n666";
        str = str.replace("\r\n", "");
        System.out.println(str);
    }
}
