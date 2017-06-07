import java.util.*;
public class palin {

    public static void main(String[] args) {
 JavaApplication13 j=new JavaApplication13();
       Scanner in=new Scanner(System.in);
       int n=in.nextInt(),r,i=0,flag=0;
       String s=Integer.toString(n);
       int[] a=new int[s.length()];
       while(n!=0)
       {    r=n%10;
            a[i++]=r;
            n=n/10;              
       }
       
       for(i=0;i<s.length();i++)
       {
           if(a[i]!=a[s.length()-i-1])
           {
               flag=1;
           }
       }
      if(flag==0)
        System.out.println("Palindrome");
      else
            System.out.println("Not a Palindrome");
      
     
    }
   
    
}
