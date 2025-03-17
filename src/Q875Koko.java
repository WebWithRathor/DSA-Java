public class Q875Koko {

    public static boolean validateMid(int[] piles, long mid, long h) {
        long left = 0;
        int pileIndex = 0, n = piles.length;
        long copy = h;
        for (;pileIndex < n;) {
            if (piles[pileIndex] <= mid) {
                pileIndex++;
            } else {
                if (left == 0) {
                    left = piles[pileIndex] - mid;
                } else {
                    left = Math.max(left - mid, 0);
                }
                if (left == 0) {
                    pileIndex++;
                }
            }
            h--;
        }


        if (left > 0) return false;
        return h >= 0;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        long sum = 0, max = 1, ans = -1;
        for (int pile : piles) {
            sum += pile;
        }
        System.out.println(max +" " + sum);
        while (max <= sum) {
            long mid = max + (sum - max) / 2;
            if (validateMid(piles, mid, h)) {
                ans = mid;
                sum = mid - 1;
            } else max = mid + 1;
        }

        return (int)ans;
    }

    public static void main(String[] args) {
//        int[] piles = {3, 6, 7, 11};
//        int[] piles = {30,11,23,4,20};
        int[] piles = {332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184};
        int h = 823855818;
        System.out.println(minEatingSpeed(piles, h));
    }
}
