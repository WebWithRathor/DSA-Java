package Initials;

public class PrimeNumber {

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= n / i; i += 2)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(isPrime(n));
    }
}
