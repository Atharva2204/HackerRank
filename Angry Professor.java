import java.util.*;

public class Professor
{
    public static void main(String ask[])
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int z = 0;z<t;z++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int a[] = new int[n];
            for(int i = 0;i<n;i++)
                a[i] = sc.nextInt();

            int ctr1=0,ctr2=0;

            for(int i= 0;i<n;i++)
            {
                if(a[i]<=0)
                  ctr1++;
                else
                  ctr2++;
            }
            if(ctr1>=k)
              System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}

