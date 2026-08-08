import java.util.*;
public class chips{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int current= m ;
    int i = 1;
    while(true){
        if(current<i){
            System.out.println(current);
            break;
        }
        current-=i;
        i++;
        if(i>n)
            i=1;
    }
    sc.close();
}
}

