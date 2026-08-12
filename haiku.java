import java.util.*;

public class haiku {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] required = {5, 7, 5};

        for (int i = 0; i < 3; i++) {

            String s = sc.nextLine();
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    count++;
                }
            }

            if (count != required[i]) {
                System.out.println("NO");
                sc.close();
                return;
            }
        }

        System.out.println("YES");

        sc.close();
    }
}