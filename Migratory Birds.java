import java.util.*;
public class mb
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num[] = new int[n];

        for(int i=0;i<n;i++)
            num[i] = sc.nextInt();

        int freq[] = new int[6]; 
        for(int i=0;i<n;i++)
            freq[num[i]]++;

        int max=1;
        for(int i=0;i<6;i++)
            if(freq[max]<freq[i])
                    max = i;

        System.out.println(max);
    }
}
