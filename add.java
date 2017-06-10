import java.util.*;
class add{  
 public static void main(String args[]){  
     Scanner in=new Scanner(System.in);
  int i,flag=0,k,j;    
  int n=in.nextInt();
  int a[]=new int[n];
  for(i=0;i<n;i++)
  {
      a[i]=in.nextInt();
  }
  for(i=0;i<n;i++)
  {
      for(j=0;j<n;j++)
      {
          for(k=0;k<n;k++)
          {
              if((a[i]+a[j]==a[k])&&(i!=j)&&(j!=k)&&(k!=i))
              {
                  
                 System.out.println(a[i]+"+"+a[j]+"="+a[k]);
              }
                  
          }
      }
  }
     
}  
} 
