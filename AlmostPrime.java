import java.util.*;
public class AlmostPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (isPrime[j] && i % j == 0) {
                    count++;
                }
            }
            if (count == 2)
                ans++;
        }
        System.out.println(ans);
        sc.close();
    }
}