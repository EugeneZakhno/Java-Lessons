import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MONTH,2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(simpleDateFormat.format(date));
    }
}
