import java.util.*;
public class icp
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();

            int cost[] = new int[n];
            for(int j=0;j<n;j++)
                cost[j]=sc.nextInt();

            for(int j=0;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if((cost[j]+cost[k])==m)
                    {
                        System.out.println((j+1)+" "+(k+1));
                        break;
                    }
                }
            }
        }
    }
}
