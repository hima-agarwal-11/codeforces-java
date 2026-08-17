import java.util.*;

public class softdrinking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // friends
        int k = sc.nextInt();   // bottles
        int l = sc.nextInt();   // ml per bottle
        int c = sc.nextInt();   // limes
        int d = sc.nextInt();   // slices per lime
        int p = sc.nextInt();   // grams of salt
        int nl = sc.nextInt();  // ml needed per toast
        int np = sc.nextInt();  // salt needed per toast

        // Toasts possible from drink
        int drink = (k * l) / nl;

        // Toasts possible from lime
        int lime = c * d;

        // Toasts possible from salt
        int salt = p / np;

        // Total toasts limited by the resource we have least of
        int totalToasts = Math.min(drink, Math.min(lime, salt));

        // Divide equally among n friends
        int answer = totalToasts / n;

        System.out.println(answer);

        sc.close();
    }
}