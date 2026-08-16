import java.util.*;

public class wannabetheguy
 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean[] levels = new boolean[n + 1];

        // Little X
        int p = sc.nextInt();

        for (int i = 0; i < p; i++) {
            int level = sc.nextInt();
            levels[level] = true;
        }

        // Little Y
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int level = sc.nextInt();
            levels[level] = true;
        }

        // Check whether every level can be passed
        for (int i = 1; i <= n; i++) {
            if (!levels[i]) {
                System.out.println("Oh, my keyboard!");
                sc.close();
                return;
            }
        }

        System.out.println("I become the guy.");

        sc.close();
    }
}