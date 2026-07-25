import java.util.*;

public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String f = sc.next();
        String m = sc.next();
        String s = sc.next();

        if ((f.equals("rock") && m.equals("scissors") && s.equals("scissors")) ||
            (f.equals("scissors") && m.equals("paper") && s.equals("paper")) ||
            (f.equals("paper") && m.equals("rock") && s.equals("rock"))) {

            System.out.println("F");

        } else if ((m.equals("rock") && f.equals("scissors") && s.equals("scissors")) ||
                   (m.equals("scissors") && f.equals("paper") && s.equals("paper")) ||
                   (m.equals("paper") && f.equals("rock") && s.equals("rock"))) {

            System.out.println("M");

        } else if ((s.equals("rock") && f.equals("scissors") && m.equals("scissors")) ||
                   (s.equals("scissors") && f.equals("paper") && m.equals("paper")) ||
                   (s.equals("paper") && f.equals("rock") && m.equals("rock"))) {

            System.out.println("S");

        } else {

            System.out.println("?");

        }

        sc.close();
    }
}