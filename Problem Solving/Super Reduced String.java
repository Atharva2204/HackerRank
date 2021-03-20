import java.util.*;
public class string
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for(int i=1;i<str.length();i++)
        {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i-1);

            if(ch1==ch2)
            {
                str=str.substring(0,i-1)+str.substring(i+1);
                i=0;
            }
        }
        if(str.length()==0)
            System.out.println("Empty String");
        else
            System.out.println(str);
    }
}
