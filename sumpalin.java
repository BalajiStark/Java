
import java.util.*;
public class sumpalin
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),k=0,sum=0,flag=0;
        int[] a=new int[n];
        while(n!=0)
        {
            int r=n%10;
            a[k++]=r;
            n=n/10;
        }
        for(int i=0;i<k;i++)
        {
            sum=sum+a[i];
        }
        String x=Integer.toString(sum);
        int l=x.length();
        int[] b=new int[l];
        k=0;
        int temp=sum;
         while(sum!=0)
        {
            int r=sum%10;
            b[k++]=r;
            sum=sum/10;
        }
        
        for(int i=0;i<b.length;i++) 
        {
            if(b[i]!=b[b.length-1-i])
                flag=1;
        }
        if(flag==0)
            System.out.println("Sum is "+temp+" and it is Palindrome");
        else
              System.out.println("Sum is "+temp+" and it is not a Palindrome");
        
            
         
}
    }

