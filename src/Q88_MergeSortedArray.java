import java.util.Arrays;

public class Q88_MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int j = 0, k = 0, l = 0;
        while (j < m && k < n) {
            if (nums1[j] > nums2[k]) temp[l++] = nums2[k++];
            else temp[l++] = nums1[j++];
        }
        while (j < m) temp[l++] = nums1[j++];
        while (k < n) temp[l++] = nums2[k++];

        for (int i = 0; i < temp.length; i++) {
            nums1[i] = temp[i];
        }

    }

    public static void inPlaceMerge(int[] nums1, int m, int[] nums2, int n) {
        int j = m-1, k = n-1, l = nums1.length-1;
        while (j >= 0 && k >= 0) {
            if (nums1[j] < nums2[k]) nums1[l--] = nums2[k--];
            else nums1[l--]= nums1[j--];
        }
        while (j >=0 ) nums1[l--] = nums1[j--];
        while (k >=0) nums1[l--] = nums2[k--];
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        inPlaceMerge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
