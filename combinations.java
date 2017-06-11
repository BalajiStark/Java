import java.util.*;
public class combinations{

    public static void main(String[] args) {

       Scanner in=new Scanner(System.in);
 int n=in.nextInt();
 int k=in.nextInt();
 for(int i=1;i<=n;i++)
    {
        for(int j=i+1;j<=n;j++)
        {
            System.out.println(i+""+j);        
        }
 
    }
}
    
}

