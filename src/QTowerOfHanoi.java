public class QTowerOfHanoi {

    public static void solve(int n, int s, int h, int d) {
        if (n == 1) {
            System.out.println(s + " -> " + d);
            return;
        }
        solve(n - 1, s, d, h);
        System.out.println(s + " -> " + d);
        solve(n - 1, h, s, d);
    }

    public static void main(String[] args) {
        int n = 3, t1 = 0, t2 = 1, t3 = 2;
        solve(n, t1, t2, t3);
    }
}
