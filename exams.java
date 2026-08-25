import java.util.*;

public class exams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        if (k >= 3 * n) {
            System.out.println(0);
        } else {
            System.out.println(3 * n - k);
        }
    }
}