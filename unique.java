import java.util.*;
public class unique {

    public static void main(String[] args) {

       Scanner in=new Scanner(System.in);
 int n=in.nextInt();
 int[] a=new int[n];
 int flag=1;
    for(int i=0;i<n;i++)
    {
        a[i]=in.nextInt();
    }
    Arrays.sort(a);
     for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(a[i]==a[j] && i!=j)
                flag=0;
        }
        if(flag==1)
            System.out.println(a[i]);
        
        flag=1;
    }
    }
}
