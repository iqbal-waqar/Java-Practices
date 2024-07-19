import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JAVA_time_apis {
    public static void main(String[] args) {
//        LocalDate d = LocalDate.now();
//        System.out.println(d);
//        LocalTime t = LocalTime.now();
//        System.out.println(t);
//        LocalDateTime dt = LocalDateTime.now();
//        System.out.println(dt);

        LocalTime t = LocalTime.of(16,18,40);
        System.out.println("The time before addition : "+t);

        LocalTime t1 = t.plusHours(8);
        System.out.println("After Addition : "+ t1);
    }
}
