package Practice;

import java.util.Arrays;
import java.util.HashSet;

public class Medium {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(5, 6, 3, 4));

//        Intersection
//        set1.retainAll(set);

//        uninon
//        set1.addAll(set);

//        Find the difference of the first set with respect
//to the second set

//        set1.forEach((Integer a)->{
//            set.remove(a);
//        });

//        remove even
//        HashSet<Integer> copy = new HashSet<>(set);
//        for (int a : copy) {
//            if (a % 2 != 0) set.remove(a);
//        }

//        check subset
//        HashSet<Integer> subset = new HashSet<>(Arrays.asList(1,2,5));
//        for(int a : subset){
//            if(!set.contains(a)){
//                System.out.println("no subset");
//                break;
//            }
//        }
//        System.out.println("phele no subset aya agr h to nhi h vrna h");


        System.out.println(set);


    }
}
