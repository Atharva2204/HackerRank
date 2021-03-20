import java.util.*;
public class Hurdle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int height[] = new int[n];
        for(int i=0;i<n;i++)
            height[i] = sc.nextInt();

        int max=0;

        for(int i =0;i<n;i++)
            if(height[max] < height[i])
                max = i;

        if(height[max]>k)
            System.out.println(height[max]-k);
        else
            System.out.println(0);
        
        /*System.out.println(Math.max(height[max]-k,0));*/
    }
}
