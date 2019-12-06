import java.util.*;
public class AC
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        for(int i=0;i<q;i++)
        {
            String str = sc.next();

            int count=0;
            for(int j=0;j<str.length()-1;j++)
            {
                char ch1 = str.charAt(j);
                char ch2 = str.charAt(j+1);
                if(ch1==ch2)
                    count++;
            }
            System.out.println(count);
        }
        
    }
}
