import java.util.*;

public class romaandluckynos{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;

        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();
            int count = 0;

            while (num > 0) {
                int digit = num % 10;

                if (digit == 4 || digit == 7)
                    count++;

                num /= 10;
            }

            if (count <= k)
                ans++;
        }

        System.out.println(ans);

        sc.close();
    }
}