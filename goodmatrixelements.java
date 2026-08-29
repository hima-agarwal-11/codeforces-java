import java.util.*;

public class goodmatrixelements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int x = sc.nextInt();

                if (i == j ||
                    i + j == n - 1 ||
                    i == n / 2 ||
                    j == n / 2) {

                    sum += x;
                }
            }
        }

        System.out.println(sum);

        sc.close();
    }
}