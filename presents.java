import java.util.*;

public class presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] answer = new int[n];

        for (int i = 1; i <= n; i++) {
            int receiver = sc.nextInt();

            // Friend i gave a gift to 'receiver'
            // So receiver received a gift from friend i
            answer[receiver - 1] = i;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}