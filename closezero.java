import java.util.*;
class closezero{  
 public static void main(String args[]){  
     Scanner in=new Scanner(System.in);
  int i,flag=0,j;  
     System.out.println("Array size");
  int n=in.nextInt();
     System.out.println("Array elements both positive and negative");
  int a[]=new int[n];
  for(i=0;i<n;i++)
  {
      a[i]=in.nextInt();
  }
   Arrays.sort(a);
   for(i=0;i<n;i++)
   {
       if(a[i]>=0 && flag==0)
       {System.out.println(a[i-1]+","+a[i+1]);
       flag=1;
       }
   }
}  
} 
