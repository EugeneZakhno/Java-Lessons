

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {


     /** OLD VERSION
     *  Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MONTH,2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(simpleDateFormat.format(date));

        // Now we will parse
        Date date1 = simpleDateFormat.parse("12/02/2019");
        System.out.println(date1);
      */

     /** NEW VERSION
      *
      */
        //System.out.println(LocalDate.now());
        LocalDate localeData = LocalDate.now();
        localeData.minusDays(5);
        localeData.plusDays(8);
        localeData.plusMonths(2);
        System.out.println(localeData.plusMonths(2));




    }
}
