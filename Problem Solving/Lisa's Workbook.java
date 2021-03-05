import java.util.*;
public class Array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num[] = new int[n];
        for(int i=0;i<n;i++)
            num[i] = sc.nextInt();

        int count=0,prevcount=0;
        for(int i=0;i<n;i++)
        {
            count=0;
            for(int j=0;j<n;j++)
                if(num[i]==num[j])
                    count++;

            if(count>prevcount)
                prevcount=count;
        }
        System.out.println(n-prevcount);
    }
}
