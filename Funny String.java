import java.util.*;
public class fs
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        for(int i=0;i<q;i++)
        {
            String str = sc.next();
            int len = str.length();

            int ascii1[] = new int[len];
            int ascii2[] = new int[len];
            int diff1[] = new int[len-1];
            int diff2[] = new int[len-1];

            String rev="";
            for(int j=0;j<len;j++)
            {
                char ch = str.charAt(j);
                rev=ch+rev;
            }

           for(int j=0;j<len;j++)
            {
                ascii1[j] = (int)str.charAt(j); 
                ascii2[j] = (int)rev.charAt(j); 
            }

            int flag=0;
            for(int j=0;j<len-1;j++)
            {
                diff1[j]=Math.abs(ascii1[j]-ascii1[j+1]); 
                diff2[j]=Math.abs(ascii2[j]-ascii2[j+1]);

                if(diff1[j]!=diff2[j])
                {
                    flag=1;
                    break;
                }
            }               
               
            if(flag==0)
                System.out.println("Funny");
            else
                System.out.println("Not Funny");
        }
    }
}
