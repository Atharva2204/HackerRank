import java.util.*;
public class me
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = "SOS";

        int len = str1.length();

        int count=0;
        for(int i=0;i<len;i++)
        {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i%3);
            if(ch1!=ch2)
                count++;
        }
        System.out.println(count);
    }
}
