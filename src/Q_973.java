import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q_973 {

    static class Pair implements Comparable<Pair> {
        int[] arr;
        double dist;

        Pair(int[] point, double dist) {
            this.arr = point;
            this.dist = dist;
        }
        public int compareTo(Pair that) {
            return this.dist > that.dist ? -1 : 1;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "arr=" + Arrays.toString(arr) +
                    ", dist=" + dist +
                    '}';
        }
    }

    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> q = new PriorityQueue<Pair>();
        for (int[] point : points) {
            int q1 = point[0] * point[0];
            int q2 = point[1] * point[1];
            double ans = (Math.sqrt(q1 + q2));
            Pair p = new Pair(point, ans);
            q.offer(p);
        }
        int [][] ans = new int[k][2];
        while(q.size()>k){
            q.poll();
        }
        for(int i =0 ; i< k; i++){
            ans[i] = q.poll().arr;
        }
        return ans;

    }

    public static void main(String[] args) {
        int [][] arr = {{2, 2}, {2, 2},{2,2},{2,2},{1,1}};
        System.out.println(Arrays.deepToString(kClosest(arr, 1)));
    }
}
