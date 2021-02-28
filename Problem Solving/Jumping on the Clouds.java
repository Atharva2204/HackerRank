import java.util.*;
public class Clouds
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int c[] = new int[n];

        for(int i=0;i<n;i++)
            c[i] = sc.nextInt();

        int e =100,i=0;

        do
        {
            i = (i+k)%n;

            if(c[i]==1)
                e-=2;     
            e--;     
        }
        while(i!=0);

        System.out.println(e);
    }
}
