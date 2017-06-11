import java.util.*;
class findrotate{  
 public static void main(String args[]){  
     Scanner in=new Scanner(System.in);
  int i,flag=0,j;  
     System.out.println("Array size");
  int n=in.nextInt();
     System.out.println("First array elements");
  int a[]=new int[n];
  int b[]=new int[n];
  for(i=0;i<n;i++)
  {
      a[i]=in.nextInt();
  }
  System.out.println("Second array elements");
   for(i=0;i<n;i++)
  {
      b[i]=in.nextInt();    
  }
   for(i=0;i<n;i++)
  {
      for(j=0;j<n;j++)
      {
          if(a[i]==b[j])
          {    flag=j;
             break;
          }
      }
  }
     System.out.println(flag+1);
}  
} 
