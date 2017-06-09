import java.util.*;
public class rotate{

    public static void main(String[] args) {

       Scanner in=new Scanner(System.in);
 int i=0,flag=0,count=0;
 int n=in.nextInt();
 int k=in.nextInt();
 for(i=n-k+1;i<=n;i++)
 {
     System.out.print(i);
 }
 for(i=1;i<n-k+1;i++)
 {
     System.out.print(i);
 }
     
     
 
    }
}
