import java .util.*;
public class Bigrams{
    public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int k = sc.nextInt();
        int[] arr=new int[k];
        int two=0;
        boolean three=false;
        for(int i=0;i<k;i++){
            arr[i]=sc.nextInt();
             if (arr[i]>=2)
                two++;
            if(arr[i]>=3)
                three=true;}
        if (three|| two>=2)
        System.out.println("YES");
    else
        System.out.println("NO");
        }
        sc.close();
    }
}
 