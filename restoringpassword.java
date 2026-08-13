import java.util.*;

public class restoringpassword {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String encrypted = sc.nextLine();

        String[] codes = new String[10];

        // Store codes for digits 0 to 9
        for (int i = 0; i < 10; i++) {
            codes[i] = sc.nextLine();
        }

        StringBuilder password = new StringBuilder();

        // Divide encrypted string into 8 groups of 10
        for (int i = 0; i < 80; i += 10) {

            String group = encrypted.substring(i, i + 10);

            // Find which digit this group represents
            for (int j = 0; j < 10; j++) {

                if (group.equals(codes[j])) {
                    password.append(j);
                    break;
                }
            }
        }

        System.out.println(password);

        sc.close();
    }
}