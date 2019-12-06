import java.util.*;
public class li
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i=0;i<n;i++)
            num[i] = sc.nextInt();

        int freq[] = new int[100];
        for(int i=0;i<n;i++)
            freq[num[i]]++;

        for(int i=0;i<100;i++)
            if(freq[i]==1)
                System.out.println(i);
    }
}
