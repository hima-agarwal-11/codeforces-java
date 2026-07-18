import java .util.*;
public class Word{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
int l = s.length();
int uc=0, lc=0;

for(int i = 0 ;i<l;i++){
    char ch = s.charAt(i);

    if (Character.isUpperCase(ch))
        uc++;
    else
        lc++;
}if (uc>lc)
    System.out.println(s.toUpperCase());
    else
        System.out.println(s.toLowerCase());
        sc.close();
    }
}
 