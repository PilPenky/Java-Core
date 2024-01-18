package HW_Lesson4.Exercise2;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Congratulation {
    public static void congratulation(ArrayList<Customer> customers) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd");
        String currentDate = formatter.format(calendar.getTime());


        if (Holidays.NEW_YEAR.getValue().equals(currentDate)) {
            for (Customer c : customers) {
                System.out.println(c.getName() + " Happy New Year!");
            }
        }

        if (Holidays.MARCH_8.getValue().equals(currentDate)) {
            for (Customer c : customers) {
                if (c.getGender().equals(Gender.FEMALE)) {
                    System.out.println(c.getName() + " Happy International Women's Say!");
                }
            }
        }

        if(Holidays.FEBRUARY_23.getValue().equals(currentDate)){
            for (Customer c : customers) {
                if (c.getGender().equals(Gender.MALE)) {
                    System.out.println(c.getName() + " Happy Defender of the Fatherland!");
                }
            }
        }
    }
}
