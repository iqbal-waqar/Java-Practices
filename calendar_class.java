import java.util.Calendar;
import java.util.TimeZone;

public class calendar_class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Karachi"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
    }
}
