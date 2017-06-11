import java.util.*;
public class arrotate{

    public static void main(String[] args) {

       Scanner in=new Scanner(System.in);
 int i=0;
 int n=in.nextInt();
 int k=in.nextInt();
 for(i=n-k;i<=n;i++)
 {
     System.out.print(i+" ");
 }
 for(i=1;i<n-k;i++)
 {
     System.out.print(i+" ");
 }
     
     
 
    }
}
