import java.util.*;
public class least{

    public static void main(String[] args) {

       Scanner in=new Scanner(System.in);
 int n=in.nextInt(),r,i=0;
 int k=in.nextInt();
 String x=Integer.toString(n);
 int n1=x.length();
 int[] a=new int[n];
 while(n!=0)
 {
     r=n%10;
     a[i++]=r;
     n=n/10;
 }
 for(i=0;i<n1;i++)
 {
     for(int j=i+1;j<n1;j++)
     {
         if(a[i]>a[j])
         {
             int temp=a[i];
             a[i]=a[j];
             a[j]=temp;
         }
     }
 }
    for(i=0;i<k-1;i++)
    {
        System.out.print(a[i]);    
    }
    
     
    }
}
