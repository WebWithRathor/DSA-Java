import java.util.Arrays;

public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {

        int C0 = 0;
        for (int i : arr) if (i == 0) C0++;
        int k = arr.length + C0 - 1, i = arr.length - 1;

        while (C0 != 0 && k > 0) {
            if (arr[i] == 0) {
                if (k < arr.length) {
                    arr[k] = 0;
                    arr[k - 1] = 0;
                    k -= 2;
                } else {
                    k--;
                }
                C0--;
            } else {
                if (k < arr.length) {
                    arr[k] = arr[i];
                }
                k--;
            }
            i--;
        }


    }

    public static void main(String[] args) {
        int[] arr = new int[]{8,4,5,0,0,0,0,7};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
/*while (C0 != 0 && k > 0) {
    if (arr[i] == 0) {
        if (k < arr.length) {
            arr[k] = 0;
            arr[k - 1] = 0;
            k -= 2;
        } else {
            k--;
        }
        C0--;
    } else {
        if (k < arr.length) {
            arr[k] = arr[i];
        }
        k--;
    }
    i--;
}*/