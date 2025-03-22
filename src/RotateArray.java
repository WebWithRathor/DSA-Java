import java.util.Arrays;

public class RotateArray {
    public static boolean findRotation(int[][] mat, int[][] target) {

        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.deepToString(mat));
            if (same(mat, target))
                return true;
            mat = rotate(mat);
        }
        return false;
    }

    public static boolean same(int[][] rotated, int[][] target) {
        int n = target.length, m = target[0].length;
        if (n == rotated.length && m == rotated[0].length) {
            for (int j = 0; j < m; j++) {
                for (int i = 0; i < n; i++) {
                    if (rotated[i][j] != target[i][j])
                        return false;
                }
            }
            return true;
        }
        return false;

    }

    public static int[][] rotate(int[][] mat) {

        int n = mat.length, m = mat[0].length;
        int[][] rotated = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotated[j][n - i - 1] = mat[i][j];
            }
        }

        return rotated;

    }

    public static void main(String[] args) {
        int[][] arr = {{0, 0}, {0, 1}};
        int[][] target = {{0, 0}, {1, 0}};
        System.out.println(findRotation(arr, target));
    }
}
