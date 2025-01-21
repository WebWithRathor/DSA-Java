package Elevate50;

import java.util.HashSet;

public class Q_575 {
    public static int distributeCandies(int[] candyType) {

        int limit = candyType.length/2;
        HashSet<Integer> set = new HashSet<>();
        for(int i= 0;i<candyType.length-1 ; i++){
            set.add(candyType[i]);
        }
        System.out.println(set);
        return (int)Math.min(set.size(),limit) ;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,4};
        System.out.println(distributeCandies(arr));;
    }
}
