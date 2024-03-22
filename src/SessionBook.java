import java.util.ArrayList;
import java.util.Arrays;

public class SessionBook {
    public static class Pair implements Comparable<Pair>{
        int start;
        int end;
        Pair(int start,int end){
            this.start = start;
            this.end = end;
        }
        @Override
        public int compareTo(Pair o) {
            return   this.end -o.end;
        }
        @Override
        public String toString() {
            return "(" + start + " , " + end +")";
        }
    }

    public static void main(String[] args) {
        int []start = {0,1, 3, 0, 5, 8, 5};
        int []end = {2,2, 4, 6, 7, 9, 9};
        int n = start.length;
        Pair[] sess = new Pair[n];
        for(int i = 0 ;i<n;i++){
            Pair p = new Pair(start[i],end[i]);
            sess[i] = p;
        }
        Arrays.sort(sess);
        ArrayList<Pair> list = new ArrayList<>();
        int max = -1;
        for(Pair p : sess){
            if(max<=p.start){
                list.add(p);
                max=p.end;
            }
        }
        System.out.println(list);
    }
}
