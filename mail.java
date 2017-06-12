import java.util.*;
public class mail {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int count=0,flag=0,flag1=0,flag2=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='@')
                count++;
            else if(c=='.')
                count++;
        }
        if(count==2)
            flag=2;
        else
            flag=1;
        int x=s.indexOf('@');
        int x1=s.indexOf('.');
        int temp=x1-x;
        if(temp>=4 && x>=3)
        {
            flag1=2;
        }
        else
            flag1=1;
        
        if(!s.endsWith(".com"))
            flag2=2;
        
        if(flag==2 && flag1==2 && flag2==0)
            System.out.println("True");
        else
            System.out.println("False");
                

    }
    
}
