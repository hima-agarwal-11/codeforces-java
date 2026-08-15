import java.util.*;

public class helpfarawayfromkingdom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        // Split integer and fractional parts
        String[] parts = s.split("\\.");

        String integerPart = parts[0];
        String fractionalPart = parts[1];

        // If integer part ends with 9
        if (integerPart.charAt(integerPart.length() - 1) == '9') {
            System.out.println("GOTO Vasilisa.");
            return;
        }

        // Check first digit after decimal
        if (fractionalPart.charAt(0) >= '5') {

            int last = integerPart.length() - 1;

            // Increase last digit by 1
            char digit = integerPart.charAt(last);
            digit++;

            integerPart = integerPart.substring(0, last) + digit;
        }

        System.out.println(integerPart);

        sc.close();
    }
}