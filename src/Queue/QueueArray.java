package Queue;

import java.util.Arrays;

public class QueueArray {

    private int[] arr;
    private int k;
    private int size;

    public QueueArray() {
        arr = new int[5];
        size = 5;
    }

    public QueueArray(int size) {
        if (size <= 0)
            throw new IndexOutOfBoundsException("Not valid size");
        arr = new int[size];
        this.size = size;
    }

    public void offer(int val) {
        if (k < size) {
            arr[k++] = val;
        } else
            throw new IndexOutOfBoundsException("Out Of Size");
    }

    public Integer poll() {
        if (k > 0) {
            int temp = arr[0];
            for (int i = 0; i < k - 1; i++) {
                arr[i] = arr[i + 1];
            }
            k--;
            return temp;
        } else {
            throw new IndexOutOfBoundsException("Out Of Size");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < k; i++) {
            sb.append(" ").append(arr[i]).append(" ");
            if (i != k - 1) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}
