package Stack;

import LinkedList.Node;

import java.util.Arrays;

public class StackArray {
    private int[] arr;
    private int k;
    private int size;


    public StackArray() {
        size = 16;
        arr = new int[size];
    }

    public StackArray(int Size) {
        size = Size;
        arr = new int[Size];
    }

    public void push(int val) {
        if (k < size) {
            arr[k++] = val;
        } else {
            throw new IndexOutOfBoundsException("Out of index");
        }
    }

    public Integer pop() {
        if (k == 0)
            throw new IndexOutOfBoundsException("out");
        int val = arr[k - 1];
        arr[k - 1] = 0;
        k--;
        return val;
    }

    @Override
    public String toString() {
        return "StackArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
