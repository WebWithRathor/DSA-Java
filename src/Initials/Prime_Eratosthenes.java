package Initials;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Prime_Eratosthenes {
    public static void main(String[] args) {
        int n = 50;
        int i = 2;
        boolean[] checker = new boolean[n + 1];
        Arrays.fill(checker, true);
        while (i <= n / i) {
            if (checker[i]) for (int j = i * i; j <= n; j += i) checker[j] = false;
            i++;
        }
        for (int j = 2; j < checker.length; j++) {
            if (checker[j]) {
                System.out.print(j + "  ");
            }
        }
    }
}
