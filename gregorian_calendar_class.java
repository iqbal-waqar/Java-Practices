import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class gregorian_calendar_class {
    public static void main(String[] args) {
        GregorianCalendar g1 = new GregorianCalendar();

        System.out.println(g1.isLeapYear(2020));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);


    }
}
