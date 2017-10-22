package edu.nyu.TweetMap.TweetUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TweetDateConverter {
    public static String convert(Date originalDate) {
        DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat time = new SimpleDateFormat("HH:mm:ss");
        return  date.format(originalDate)+"T"+time.format(originalDate);
    }

    public static String currentDateTime() {
        return convert(new Date());
    }
}
