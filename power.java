import java.util.*;
public class power{

    public static void main(String[] args) {
 JavaApplication13 j=new JavaApplication13();
       Scanner in=new Scanner(System.in);
       int base=in.nextInt();
       int power=in.nextInt();
       int temp=base;
       for(int i=0;i<power-1;i++)
       {
         base = base * temp;
       }
        System.out.println(base);
     
    }
   
    
}
