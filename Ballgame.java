
 import java.util.*;
 public class Ballgame{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        int num =1;
        int count = 1;
        for(int i = 1;i<n;i++){
             num = count+num;
             num=num%n;
             if(num==0)
                num=n;
           
            count++;
            System.out.print(num +" ");
        }
    
    sc.close();
    }
 }
 