package HW_Lesson1.date_add;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateNow {
    public static String date() {
        String pattern = "dd.MM.yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        return date;
    }
}
