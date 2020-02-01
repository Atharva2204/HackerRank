import java.util.*;
public class p
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.toUpperCase();

        int ctr[] = new int[26];

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(Character.isLetter(ch))
                ctr[(int)ch-65]++;
        }

        int flag = 0;
        for(int i=0;i<26;i++)
        {
            if(ctr[i] < 1)
                flag = 1;
        }

        if(flag==1)
            System.out.println("not pangram");
        else
            System.out.println("pangram");
    }
}
