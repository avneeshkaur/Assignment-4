import java.util.Arrays;

public class ArrayConversion {
    public static int[][] convertTo2D(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[i * n + j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;
        int[][] convertedArray = convertTo2D(original, m, n);
        for (int[] row : convertedArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}
