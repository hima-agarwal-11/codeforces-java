import java.util.*;
public class triangularnum{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1 ;i<n;i++){
        int sum=i*(i+1)/2;
        if(sum==n){
            System.out.println("YES");
            sc.close();
            return;
        }
        if(sum>n)
            break;
    }
    System.out.println("NO");
    
    sc.close();

}
}

