import java.util.*;

public class array_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(15);
        l2.add(16);
        l2.add(17);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(5);
        l1.add(2, 6);
        l1.add(0, 1);
        l1.addAll(l2);
//        l1.clone();
//        l1.clear();
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        l1.remove(0);
        l1.remove(1);
        l1.set(2, 8);
        l1.removeIf(n -> (n % 5 == 0));
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(" , ");
        }
        int key;
        while (true) {
            System.out.println("Enter the number to check");
            key = sc.nextInt();
            if (l1.contains(key)) {
                System.out.println("Yes it is present!..");

                break;
            } else {
                System.out.println("No it is no present..");
            }

        }

    }
}

