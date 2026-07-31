import java.util.*;
public class dieroll {
      public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int Y = sc.nextInt();
        int W =sc.nextInt();

        int D=6-Math.max(Y,W)+1;
        if(D==1)
            System.out.println("1/6");
        else if(D==2)
            System.out.println("1/3");
        else if(D==3)
            System.out.println("1/2");
        else if(D==4)
            System.out.println("2/3");
        else if(D==5)
            System.out.println("5/6");
        else if(D==6)
            System.out.println("1/1");
        sc.close();
    }
}
