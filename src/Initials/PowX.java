package Initials;

public class PowX {

    public static double Power(double n, int m) {
        if ( n==0) return 1.0;
        double ans = 0;
        if(n<0) ans = 1/fun(n,m);
        else ans = fun(n,m);
        return ans;
    }

    public static double fun(double x , int n){
        if(n==0) return 1;
        double s = fun(x , n/2);
        if(n%2==0) return s*s;
        return s*s*x;
    }

    public static void main(String[] args) {
        double n = 10;
        int m = 2;
        int ans = 1;
        System.out.println(Power(n, m));
    }
}
