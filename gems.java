import java.util.*;
public class gems{

    public static void main(String[] args) {

       Scanner in=new Scanner(System.in);
 int n=in.nextInt(),r,i=0,sum=0;
 int[] a=new int[n];
 for(i=0;i<n;i++)
 {
     a[i]=in.nextInt();
     sum=sum+a[i];
 } 
if(n%2==0 && sum%2==0)
{
    System.out.println("Partition is  possible");
} else
     System.out.println("Partition is Not Possible");
    
     
    }
}
