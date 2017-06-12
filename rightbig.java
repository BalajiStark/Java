import java.util.*;
public class rightbig{
    public static void main(String ar[])
            {
                Scanner in=new Scanner(System.in);
                 System.out.println("Array size");
        int n=in.nextInt();
        int flag=0,flag1=0,big=0;
        System.out.println("Array Elements");
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
         for(int j=i+1;j<n;j++)
         {
             if(a[j]>big)
                 big=a[j];
         }
         a[i]=big;
         big=0;
        }
           for(int i=0;i<n;i++)
    {
        System.out.print(a[i]+" ");
    }      
    }
   
}
