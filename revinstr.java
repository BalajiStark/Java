import java.util.*;
public class revinstr{
    public static void main(String ar[])
            {
                Scanner in=new Scanner(System.in);
              String s=in.nextLine();
              String[] s1=s.split("\\s");
              for(int i=0;i<s1.length;i++)
              {
                  StringBuffer sb=new StringBuffer();
                  if(i%2==0)
                  {  
                      sb.append(s1[i]);
                      System.out.print(sb.reverse()+" ");
                  }
                  else
                      System.out.print(s1[i]+" ");
              }
                 
    }
   
}
