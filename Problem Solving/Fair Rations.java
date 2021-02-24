import java.util.*;
public class Fr
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i=0;i<n;i++)
            num[i]=sc.nextInt();
        
        int flag=0,ctr1=0,ctr2=0;
        for(int i=0;i<n-1;i++)
        {
            if(num[i]%2!=0)
            {
                num[i]=num[i]+1;
                num[i+1]=num[i+1]+1;
                ctr1+=2;
            }

            for(int j=0;j<n;j++)
                if(num[j]%2==0)
                    ctr2++;

            if(ctr2==n)
            {
                flag=1;
                break;
            }
            ctr2=0;
        }
        if(flag==1)
            System.out.println(ctr1);
        else
            System.out.println("NO");
    }
}
