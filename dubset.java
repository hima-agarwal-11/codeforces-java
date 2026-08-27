import java.util.*;

public class dubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        // Replace every WUB with a space
        s = s.replace("WUB", " ");

        // Remove extra spaces and print the original song
        System.out.println(s.trim().replaceAll(" +", " "));
        sc.close();
    }
}