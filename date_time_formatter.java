import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date_time_formatter {
    public static void main(String[] args) {
        LocalDateTime d1 = LocalDateTime.now();
        System.out.println(d1);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E hh:mm a");
//        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate = d1.format(df);
//        String myDate = d1.format(df);
        System.out.println(myDate);
    }
}
