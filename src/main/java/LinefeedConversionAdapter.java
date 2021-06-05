import com.nsn.bighead.glassfish.filterse.handler.DataFilterAdapter;
import org.apache.log4j.Logger;

public class LinefeedConversionAdapter extends DataFilterAdapter {
    private static final Logger log = Logger.getLogger(LinefeedConversionAdapter.class);

    public String handleBuffer(String[] arg0, String arg1, int columnX, String service) {
        if (!"".equals(arg1)) {
            try {
                arg1 = arg1.replace("\r\n", "");
            } catch (Exception e) {
                log.error(e.getMessage() + "LinefeedConversionAdapter异常");
            }
        }
        return arg1;
    }
}
