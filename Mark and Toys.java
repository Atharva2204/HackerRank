/*
Initial Thoughts: We can sort the toy  prices ascending then
                  substract their prices from our total money
                  until we can no longer buy any more toys, 
                  and since they are sorted in ascending order
                  we know that if we can't buy the current toy
                  then we can't buy any others either
Time Complexity: O(n log(n)) //It takes n log n time to run quicksort on the input array
Space Complexity: O(n) //We dynamically allocate and array to store the input
*/

import java.util.Scanner;
import java.util.Arrays;

public class Toys
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int price[] = new int[n];

        for(int i=0 ; i<n ; i++)
            price[i] = sc.nextInt();

        Arrays.sort(price);

        int count = 0;

        for(int i=0;i<n;i++)
        {
            k -= price[i];

            if(k>0)
                count++;
            else
                break;
        }
        System.out.println(count);
    }
}
