import java.util.Scanner;


public class revarray {

   
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        System.out.println("Array size");
        int n=in.nextInt();
         int[] a=new int[n];
         System.out.println("Array Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();  
        }
        System.out.println("Reversed Array is");
          for(int i=n-1;i>=0;i--)
        { if(i!=0)
            System.out.print(a[i]+",");    
        else
                System.out.println(a[i]);
        }
        
        
        
    }
}
