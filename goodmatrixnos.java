import java.util.*;

public class goodmatrixnos
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        int middle = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int value = sc.nextInt();

                // Check if the element is good
                if (i == j ||                    // Main diagonal
                    i + j == n - 1 ||            // Secondary diagonal
                    i == middle ||               // Middle row
                    j == middle) {               // Middle column

                    sum += value;
                }
            }
        }

        System.out.println(sum);
        sc.close();
    }
}