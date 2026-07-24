
import java.util.*;
public class Sequence123{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        
        int cnt1=0,cnt2=0,cnt3=0;
        for (int i = 0; i <n;i++){
             a[i]=sc.nextInt();
            if (a[i]==1)
                cnt1++;
            else if (a[i]==2)
                cnt2++;
            else
                cnt3++;
        }
        int maxfreq=Math.max(cnt1,Math.max(cnt2,cnt3));
        System.out.println(n-maxfreq);
        sc.close();
    }
}