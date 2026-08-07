import java.util.*;
public class blackjack{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int need= n-10;
    if(need<1 || need>11)
        System.out.println(0);
    else if (need==10)
        System.out.println(15);
    else 
        System.out.println(4);
    sc.close();
}
}
