import java.util.*;
public class CC
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int count=1;

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))
                count++;
        }
        System.out.println(count);
    }
}
