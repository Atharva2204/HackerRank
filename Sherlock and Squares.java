import java.util.Scanner;
import java.lang.Math;           // Imported by default

public class sas
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            /* int ctr = 0;

            for(int j=a;j<=b;j++)                   // Correct but terminated due to timeout
            {
                double sqrt = Math.sqrt(j);
                if(sqrt - Math.floor(sqrt) == 0)
                    ctr++;
            }
            System.out.println(ctr);
            ctr = 0; */

            int start = (int) Math.sqrt(a); // Finds our starting squareInteger
            int end = (int) Math.sqrt(b);   // Finds our ending squareInteger
            
            int squareIntegers = end-start; // Calculates the squareIntegers between them
            
            squareIntegers += (Math.pow(start,2) >= a) ? 1 : 0; // Checks to make sure we didn't forget one when we floored A
            
            System.out.println(squareIntegers);
        }
    }
}
