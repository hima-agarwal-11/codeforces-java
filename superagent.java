import java.util.*;
public class superagent {
      public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        char[][] arr = new char[3][3];
        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            for (int j = 0; j < 3; j++) {
                arr[i][j] = s.charAt(j);
    }
}
        
        if(arr[0][0]==arr[2][2] && arr[1][0]==arr[1][2] && arr[2][0]==arr[0][2] && arr[0][1]==arr[2][1]){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }    

        sc.close();
    }
}
