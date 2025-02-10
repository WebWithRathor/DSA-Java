package Queue;

import java.util.Arrays;

public class QueueCircularArray {

    private int[] arr;
    private int s = 0;
    private int e = 0;
    private int size;


    public void offer(int val) {
        if (s <= e) {
            arr[e++] = val;
            if (e == size - 1) {
                e = 0;
            }
        } else
            throw new IndexOutOfBoundsException("Out of bound");
    }

    public int poll() {
        int temp = arr[s];
        if (e < size) {
            for (int i = s; i < e; i++) {
                arr[i] = arr[i + 1];
            }
        } else {
            for (int i = s; i < size; i++) {
                arr[i] = arr[i + 1];
            }
            for (int i = 0; i < s; i++) {
                arr[i] = arr[i + 1];
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        return "QueueCircularArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
