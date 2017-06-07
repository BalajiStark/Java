import java.util.*;
public class prime{

    public static void main(String[] args) {
 JavaApplication13 j=new JavaApplication13();
       Scanner in=new Scanner(System.in);
       int n=in.nextInt(),r,i=0,flag=0;
       String s=Integer.toString(n);
      for(i=2;i<n;i++)
      {
          if(n%i==0)
              flag=1;
      }
      
      if(flag==0)
        System.out.println("Prime Number");
      else
            System.out.println("Not a Prime Number");
      
     
    }
   
    
}
