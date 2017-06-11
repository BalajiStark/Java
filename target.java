import java.util.Scanner;

public class target {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
                System.out.println("Array Size");
              	int n=in.nextInt();
                int[] a=new int[n];
                int flag=0;
                System.out.println("Array elements");
                for(int i=0;i<n;i++)
                {
                 a[i]=in.nextInt();
                }
                System.out.println("Target");
                int k=in.nextInt();
                 for(int i=0;i<n;i++)
                 {
                     for(int j=0;j<n;j++)
                     {
                         if((a[i]+a[j])==k &&(i!=j) && flag==0)
                         {
                             System.out.println(a[i]+" "+a[j]);
                             flag=1;
                         }
                     }
                 }
                 if(flag==0)
                 {
                     System.out.println("Not Possible");
                 }
                
}
}
