import java.util.*;
public class array_dequeue {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        ad1.offerFirst(10);

        ad1.addLast(78);
        ad1.offerLast(90);

        ad1.removeLast();
        System.out.println(ad1);

    }
}