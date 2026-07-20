import java.util.*;
public class Letter {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][]arr=new char[n][m];
        int top=n;
        int bottom=-1;
        int right=-1;
        int left=m;
        for(int i = 0;i<n;i++){
            String s=sc.next();
            for(int j = 0;j<m;j++){
                arr[i][j]=s.charAt(j);
                if(arr[i][j]=='*'){
                    top=Math.min(top,i);
                    bottom=Math.max(bottom,i);
                    right=Math.max(right,j);
                    left=Math.min(left,j);
                }
            }
        }
            for(int i =top;i<=bottom;i++){
                    for(int j = left;j<=right;j++){
                        System.out.print(arr[i][j]);
                    }System.out.println();
            }
        
        sc.close();

    }
}
