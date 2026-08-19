import java.util.*;

public class luckyticket{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String ticket = sc.next();

        int sum1 = 0, sum2 = 0;
        boolean lucky = true;

        for (int i = 0; i < n; i++) {
            char ch = ticket.charAt(i);

            // Check lucky digit
            if (ch != '4' && ch != '7') {
                lucky = false;
            }

            // Calculate sums
            if (i < n / 2) {
                sum1 += ch - '0';
            } else {
                sum2 += ch - '0';
            }
        }

        if (lucky && sum1 == sum2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}