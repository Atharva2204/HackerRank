import java.util.*;
public class pat
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w[] = new int[n];

        for(int i=0;i<n;i++)
            w[i]=sc.nextInt();

        Arrays.sort(w);     // Sort the weights in ascending order
        
        int b = -1,ctr=0;

        for(int i=0;i<n;i++)
        {
            if(w[i] > b)
            {
                b = w[i]+4;
                ctr++;
            }
        }
        System.out.println(ctr);
    }
}
