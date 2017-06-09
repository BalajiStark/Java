import java.util.*;
public class JavaApplication13{

    public static void main(String[] args) {

       Scanner in=new Scanner(System.in);
 int n=in.nextInt(),i=0,flag=0,count=0;
 for(i=1;i<n;i++)
 {   flag=0;
     for(int j=2;j<i;j++)
     {
         if(i%j==0)
             flag=1;
     }
     if(flag==0)
         count++;
 } 
        System.out.println(count);
     
    }
}
