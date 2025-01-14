package Initials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FactorialAndSum {

    public static int Factorial(int n) {
        if (n <= 1) return 1;
        return n * Factorial(n - 1);
    }

    public static int Sum(int n) {
        if (n == 0) return n;
        return n + Sum(n - 1);
    }

    public static int FibonacciSeries(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return FibonacciSeries(n - 2) + FibonacciSeries(n - 1);
        // 0 1 1 2 3 5 8
    }

    public static void main(String[] args) {
//        System.out.println(Sum(5));
//        System.out.println(Factorial(1));
        int [] arr = new int[7];
        for (int i = 0; i < 7; i++) {
          arr[i] = FibonacciSeries(i);
        }
        System.out.println(Arrays.toString(arr));

    }

}
