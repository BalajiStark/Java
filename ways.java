import java.util.*;
class ways{  
 public static void main(String args[]){  
     Scanner in=new Scanner(System.in);
  int i,flag=0,j;  
     System.out.println("Array size");
  int n=in.nextInt();
     System.out.println("Array elements");
  int a[]=new int[n];
  for(i=0;i<n;i++)
  {
      a[i]=in.nextInt();
  }
     System.out.println("Enter difference");
  int k=in.nextInt();
  for(i=0;i<n;i++)
  {
      for(j=0;j<n;j++)
      {
          
              if(((a[i]-a[j]==k) || ((a[j]-a[i]==k)))&&(i!=j))
              {
                  
                 System.out.println(a[i]+","+a[j]);
                 flag++;
              }
                  
          
      }
  }
     System.out.println("There are "+flag+" possible ways are ");
     
}  
} 
