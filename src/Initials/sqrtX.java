package Initials;

public class sqrtX {
    public static int BinaryRoot(int n) {
        int start = 1, end = n / 2, mid, ans = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid <= (n / mid)) {
                ans = mid;
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 47;
        System.out.println(BinaryRoot(n));
    }
}
