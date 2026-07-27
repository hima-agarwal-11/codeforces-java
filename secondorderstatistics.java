import java.util.*;

public class secondorderstatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x < min) {
                secondMin = min;
                min = x;
            } else if (x > min && x < secondMin) {
                secondMin = x;
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("NO");
        } else {
            System.out.println(secondMin);
        }

        sc.close();
    }
}