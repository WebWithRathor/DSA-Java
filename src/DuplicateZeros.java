import java.util.Arrays;

public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {

        int C0 = 0;
        for (int i : arr) if (i == 0) C0++;

        int k = arr.length + C0 - 1, i = arr.length - 1;
        int count = arr.length - 1;
        while (C0 != 0 && k > 0) {
            int current = arr[count--];
            if (k <= i) {
            System.out.println(k +" " + current +  " " + i);
                arr[k] = current;
                if (current == 0) {
                    arr[--k] = current;
                }
            }
            else if (current == 0) {
                k--;
                if (k <= i)arr[k]=current;
            }
            k--;
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{8,4,5,0,0,0,0,7};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
