package Practice;

import java.util.Arrays;

public class compareString {
    public static void main(String[] args) {
        String s1 = "hello im a sentence ashtha aja aja";
        String[] carr = s1.split(" ");
        for (int i = 0; i < carr.length; i++) {
            for (int j = 0; j < carr.length-1-i; j++) {
                if (carr[j].compareTo(carr[j+1]) > 0) {
                    String temp = carr[j];
                    carr[j] = carr[j+1];
                    carr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(carr));
    }
}
