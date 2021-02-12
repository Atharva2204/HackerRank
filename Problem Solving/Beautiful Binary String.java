import java.util.*;
public class bbs
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        String str=sc.next();

        int ctr=0;
        for(int i=0;i<n-2;i++)
        {
            if(str.substring(i,i+3).equals("010"))
            {
                ctr++;
                i+=2;
            }
        }
        System.out.println(ctr);
    }
}
