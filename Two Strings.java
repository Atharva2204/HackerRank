import java.util.*;
public class strings
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        
        for(int i=0;i<p;i++)
        {
            String s1 = sc.next();
            String s2 = sc.next();

            int len1 = s1.length();
            int len2 = s2.length();

            int flag=0;
            int min=Math.min(len1,len2);
            
            for(int j=0,k=0;j<min;j++,k++)
            {
                char ch1 = s1.charAt(j);
                char ch2 = s2.charAt(k);
                if(ch1==ch2)
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
