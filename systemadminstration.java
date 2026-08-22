import java.util.*;

public class systemadminstration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int successA = 0, totalA = 0;
        int successB = 0, totalB = 0;

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (t == 1) {
                successA += x;
                totalA += x + y;
            } else {
                successB += x;
                totalB += x + y;
            }
        }

        if (successA * 2 >= totalA) {
            System.out.println("LIVE");
        } else {
            System.out.println("DEAD");
        }

        if (successB * 2 >= totalB) {
            System.out.println("LIVE");
        } else {
            System.out.println("DEAD");
        }
    }
}