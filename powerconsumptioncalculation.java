import java.util.*;
public class powerconsumptioncalculation {
        public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        int P1 =sc.nextInt();
        int P2 =sc.nextInt();
        int P3 =sc.nextInt();
        int T1 =sc.nextInt();
        int T2 =sc.nextInt();
        int[] l= new int[n];
        int[] r= new int[n];
        int ans= 0;
        for(int i = 0 ;i<n;i++){
             l[i] = sc.nextInt();  
             r[i]=sc.nextInt();
        }
        for(int i = 0 ;i<n;i++){
            ans += (r[i] - l[i]) * P1;
            if(i<n-1){
                int gap = l[i+1]-r[i];
                int normal = Math.min(gap, T1);
                ans += normal * P1;
                int screen = Math.min(Math.max(gap - T1, 0), T2);
                ans += screen * P2;
                 int sleep = Math.max(gap - T1 - T2, 0);
                ans += sleep * P3;

            }
        }
        
                
        System.out.println(ans);
        sc.close();
    }
}
