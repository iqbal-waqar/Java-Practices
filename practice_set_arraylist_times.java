import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class practice_set_arraylist_times {
    public static void main(String[] args) {
//        Question No - 1
//        ArrayList<String> arr = new ArrayList<>();
//
//        arr.add("Student 1");
//        arr.add("Student 2");
//        arr.add("Student 3");
//        arr.add("Student 4");
//        arr.add("Student 5");
//        arr.add("Student 6");
//        arr.add("Student 7");
//
////        arr.remove(4);
//
//        for (String o:arr){
//            System.out.println(o);
//        }

//        Question No - 2
//        HashSet<String> mySet = new HashSet<>();
//
//        mySet.add("1 - Apple");
//        mySet.add("2 - Banana");
//        mySet.add("3 - Cherry");
//        mySet.add("1 - Apple");
//        mySet.add("2 - Banana");
//        System.out.println("Elements in the set are : ");
//        for (String obj: mySet){
//            System.out.println(obj);
//        }

        //        Question No - 3

        Date d1 = new Date();
        System.out.println(d1.getHours()+":"+d1.getMinutes()+":"+d1.getSeconds());

        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.get(Calendar.HOUR)+":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND));

        LocalDateTime d11 = LocalDateTime.now();

        DateTimeFormatter df11 = DateTimeFormatter.ofPattern("dd-mm-yyyy");
        String ms = d11.format(df11);
        System.out.println(ms);


    }
}
