import java.util.*;
public class bt
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int num[] = new int[n];
        for(int i=0;i<n;i++)
            num[i]=sc.nextInt();
        
        int ctr=0;
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                if(Math.abs(num[i]-num[j])==d)
                    for(int k=j+1;k<n;k++)
                        if(Math.abs(num[j]-num[k])==d)
                            ctr++;

        System.out.println(ctr);
    }
}
