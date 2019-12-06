import java.util.*;
public class Bon
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int bill[] = new int[n];

        for(int i = 0;i<n;i++)
            bill[i] = sc.nextInt();

        int b = sc.nextInt();

        int sum = 0;
        for(int i = 0 ; i<n;i++)
            sum += bill[i];

        sum -= bill[k];
        sum /= 2;

        if(b == sum)
            System.out.println("Bon Appetit");
        else
            System.out.println(b-sum);       
    }
}

