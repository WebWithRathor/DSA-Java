import java.util.HashMap;
import java.util.PriorityQueue;

public class Q_374 {
    class Pair implements Comparable<Pair> {
        int key;
        int freq;

        Pair(int key, int freq) {
            this.key = key;
            this.freq = freq;
        }

        public int compareTo(Pair that) {
            return that.freq - this.freq;
        }

    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

//        PriorityQueue<>> q = new PriorityQueue<Pair>((a,b)->a.getValue() - b.getValue());


        return new int[2];
    }
}
