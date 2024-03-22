package Heap;

import java.util.Arrays;

public class ArrayHeap {
    int arr[];
    int size;

    ArrayHeap(int size) {
        arr = new int[size];
        size = 0;
        arr[0] = -1;
    }

    ArrayHeap() {
        arr = new int[150];
        size = 0;
        arr[0] = -1;
    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void swap2(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void insert(int value) {
        size++;
        arr[size] = value;
        int index = size;

        while (index > 1) {
            int parent = index / 2;
            if (arr[parent] < arr[index]) {
                swap(parent, index);
                index = parent;
            } else return;
        }
    }

    public void deletion() {
        arr[1] = arr[size];
        size--;
        int index = 1;

        while (index < size) {
            int left = arr[index * 2], right = arr[index * 2 + 1];
            int larger = left > right ? index * 2 : index * 2 + 1;
            if (arr[larger] > arr[index]) {
                swap(larger, index);
                index = larger;
            } else return;
        }
    }

    @Override
    public String toString() {
        for (int i = 0; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        return "";
    }

    public void heapify(int[] arr, int size, int i) {
        int larger = i;
        int left = 2 * i, right = 2 * i + 1;
        if (left <= size && arr[left] > arr[larger]) larger = left;
        if (right <= size && arr[right] > arr[larger]) larger = right;
        if (larger != i) {
            swap2(arr, larger, i);
            heapify(arr, size, larger);
        }
    }

    public static void main(String[] args) {
        ArrayHeap obj = new ArrayHeap();
        obj.insert(1);
        obj.insert(3);
        obj.insert(8);
        obj.insert(1);
        obj.insert(3);
        obj.insert(5);
        obj.insert(8);
        obj.deletion();
        int[] brr = new int[]{-1, 1, 2, 3, 4, 532, 432, 45, 65, 45};
        int size = brr.length - 1;
        for (int i = size / 2; i >=1; i--) {
            obj.heapify(brr, size, i);
        }
        System.out.println(Arrays.toString(brr));

    }

}
