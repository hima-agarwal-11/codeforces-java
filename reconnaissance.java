import java.util.*;
public class reconnaissance {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int [] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();   
        }
        Arrays.sort(arr);
        int cnt=0;

       for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
        if (arr[j] - arr[i] <= d) {
                cnt+=2;
        }
            }
        }System.out.println(cnt);
        sc.close();

    }
}
