import java.util.*;

public class ultrafastmathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        for (int i = 0; i < s1.length(); i++) {
            int bit = (s1.charAt(i) - '0') ^ (s2.charAt(i) - '0');
            System.out.print(bit);
        }

        sc.close();
    }
}