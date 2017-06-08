import java.util.*;
public class revint {

    public static void main(String[] args) {

       Scanner in=new Scanner(System.in);
 int n=in.nextInt(),r;
 while(n!=0)
 {   r=n%10;
     n=n/10;
     System.out.print(r);   
 }
    }
}
