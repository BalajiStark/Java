import java.util.Scanner;
public class removechar {
  public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    char[] c=s.toCharArray();
    int flag=0;
    
        for(int i=0;i<c.length;i++)
        {
          for(int j=0;j<c.length;j++)
          {
              if((c[i]==c[j])&&(i!=j)&&(flag==0))
              {
                  System.out.print(c[i]);
                  c[j]='/';
                 flag=1;   
              }
          }
          if(flag==0 && c[i]!='/')
            System.out.print(c[i]);
          
            flag=0;
        }        
    }
}
