import java.util.*;
public class index {

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
       if(i==a[i])
            System.out.println(i);
    }
    }
}
