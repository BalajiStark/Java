import java.util.*;
public class isomorph{

    public static void main(String[] args) {

       Scanner in=new Scanner(System.in);
 int i=0,flag=0,count=0;
 String s=in.nextLine();
 String s1=in.nextLine();
 int n=s.length();
 if(s.length()==s1.length())
 {
     for(i=0;i<n;i++)
 {
     char c=s.charAt(i);
     char c1=s1.charAt(i);
     for(int j=0;j<n;j++)
     {
         if(i!=j && c==s.charAt(j))
         {  
             if(c1!=s1.charAt(j))
                 flag=1;
         }
     }
     
     
 }
     if(flag==1)
         System.out.println("False");
     else
         System.out.println("True");
     
 
 }
 else
 {
     System.out.println("False");
 }  
    }
}
