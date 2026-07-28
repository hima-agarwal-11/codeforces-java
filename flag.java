import java.util.*;
public class flag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        char [] [] arr= new char[n][m];
        for (int i = 0; i < n; i++) {
            String s= sc.next();
            for(int j = 0 ;j<m;j++){
                arr[i][j]=s.charAt(j);
            }
        }
        for(int i =0;i<n;i++){
            char color=arr[i][0];
            for(int j = 1;j<m;j++){
                if(arr[i][j]!=color){
                    System.out.println("NO");
                    sc.close();
                    return ;
                }
            }
if(i>0 && arr[i][0]==arr[i-1][0]){
    System.out.println("NO");
    sc.close();
    return ;
}
}
System.out.println("YES");
sc.close();
    }
}