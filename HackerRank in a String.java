import java.util.*;
public class Hackerrank
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        String hackerrank = "hackerrank";
        for(int i=0;i<q;i++)
        {
            String s = sc.next();
            int index = 0;
            int flag=0;
            
            for(int j=0;j<s.length();j++)
            {
                char ch1 = hackerrank.charAt(index);
                char ch2 = s.charAt(j);

                if(ch1==ch2)
                    index++;

                if(index==hackerrank.length())
                {
                    flag=1;
                    break;
                }               
            }

            if(flag==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
