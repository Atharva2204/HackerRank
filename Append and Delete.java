import java.util.*;
public class Digits
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int a =n;
            int count=0;

            while(n>0)
            {
                int temp = n%10;
                n/=10;
                if(temp!=0 && a%temp==0)
                    count++;                   
            }
            System.out.println(count);
        }
    }
}
