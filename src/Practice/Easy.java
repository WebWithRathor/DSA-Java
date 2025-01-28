package Practice;

import java.util.Arrays;
import java.util.HashSet;

public class Easy {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5));
        set.add(3);
        System.out.println(set);

//        2
        HashSet<String> set1 = new HashSet<>(Arrays.asList("apple", "banana", "cherry"));
        System.out.println(set1.contains("banana"));

//        3
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(10, 20, 30, 40));
        System.out.println(set2.remove(20));

//        4
        HashSet<Integer> set3 = new HashSet<>(Arrays.asList(5, 10, 15, 20, 25));
        set3.add(null);
        System.out.println(set3);
        set3.forEach((Integer a)->{
            System.out.println(a);
        });

    }
}
