import javax.xml.crypto.Data;
import java.util.Date;
//class date1 extends Date
//{
//    public date1(int year, int month, int date, int hrs, int min){
//
//    }
//}
public class date_and_time {
    public static void main(String[] args) {
//        System.out.println("Years Passed after 1st JAN , 1970 ");
//        System.out.println(":"+System.currentTimeMillis()/1000/3600/24/

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
    }
}
