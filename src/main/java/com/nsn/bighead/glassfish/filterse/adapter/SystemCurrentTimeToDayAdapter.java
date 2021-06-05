package com.nsn.bighead.glassfish.filterse.adapter;

import com.nsn.bighead.glassfish.filterse.handler.DataFilterAdapter;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemCurrentTimeToDayAdapter extends DataFilterAdapter {
    private static final Logger log = Logger.getLogger(SystemCurrentTimeToDayAdapter.class);

    public String handleBuffer(String[] arg0, String arg1, int columnX, String service) {
        String format="19700101";
            try {
                SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
                format = sf.format(new Date());
            } catch (Exception e) {
                log.error(e.getMessage() + "SystemCurrentTimeToDayAdapter异常");
            }
        return format;
    }
}
