import java.util.*;
public class panoramixprediction{
    static boolean isprime(int n ){
        if(n<2)
            return false;
        else 
            for(int i =2;i*i<=n;i++){
        if(n%i==0)
        return false;
    }return true;
    }
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    if(isprime(n) && isprime(m)){
    for(int i = n+1;i<m;i++){
       if(isprime(i)){
        System.out.println("NO");
    sc.close();
    return;
    }
    }
    System.out.println("YES");
}else
{
    System.out.println("NO");
}

    sc.close();

}
}