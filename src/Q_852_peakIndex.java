public class Q_852_peakIndex {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        int mid = 0;


        while (start != end) {
            mid = (start + end)/2;
            System.out.println(arr[mid]  +" "+ arr[start] +" " +arr[end]);
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
