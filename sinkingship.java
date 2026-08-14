import java.util.*;

public class sinkingship {

    static int priority(String status) {
        if (status.equals("rat"))
            return 1;
        else if (status.equals("woman") || status.equals("child"))
            return 2;
        else if (status.equals("man"))
            return 3;
        else
            return 4; // captain
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[][] crew = new String[n][2];

        for (int i = 0; i < n; i++) {
            crew[i][0] = sc.next(); // name
            crew[i][1] = sc.next(); // status
        }

        Arrays.sort(crew, (a, b) -> {
            return priority(a[1]) - priority(b[1]);
        });

        for (int i = 0; i < n; i++) {
            System.out.println(crew[i][0]);
        }

        sc.close();
    }
}