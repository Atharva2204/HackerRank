import java.util.*;
public class jotc
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        int cloud[] = new int[n];

        for(int i = 0;i<n;i++)
            cloud[i] = sc.nextInt();

        int ctr = 0;
        for(int i=0;i<n-2;i++)
        {
            if(!(cloud[i]==0 && cloud[i+2]==0) && cloud[i]==0 && cloud[i+1]==0 || cloud[i]==0 && cloud[i+2]==0)
            {
                ctr++;
            }
        }
        System.out.println(ctr);
    }
}
