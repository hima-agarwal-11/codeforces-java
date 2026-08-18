import java.util.*;

public class gameoutcome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] a = new int[n][n];
        int[] rowSum = new int[n];
        int[] colSum = new int[n];

        // Input + calculate row and column sums
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                a[i][j] = sc.nextInt();

                rowSum[i] += a[i][j];
                colSum[j] += a[i][j];
            }
        }

        int count = 0;

        // Check every cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (colSum[j] > rowSum[i]) {
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}