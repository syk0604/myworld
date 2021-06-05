package com.nsn.bighead.glassfish.filterse.adapter;

import com.nsn.bighead.glassfish.filterse.handler.DataFilterAdapter;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SystemCurrentTimeAdapter extends DataFilterAdapter {
    private static final Logger log = Logger.getLogger(SystemCurrentTimeAdapter.class);

    /**
     * 系统时间转换成毫秒时间戳
     *
     * @param arg0
     * @param arg1
     * @param columnX
     * @param service
     * @return
     */

    @Override
    public String handleBuffer(String[] arg0, String arg1, int columnX, String service) {
        return handleBuffer(arg0, arg1, columnX, service, "");
    }

    @Override
    public String handleBuffer(String[] arg0, String arg1, int columnX, String service, String extPars) {
        String result = "";
        try {
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            result = String.valueOf(timeInMillis);
            log.info("result的值:" + result);
        } catch (Exception e) {
            log.error(e.getMessage() + "SystemCurrentTimeAdapter异常");
        }
        return result;
    }

    @Override
    public void init(String extPars) {

    }
}
