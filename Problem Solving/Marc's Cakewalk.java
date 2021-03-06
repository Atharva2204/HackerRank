/* Algorithm: Eat the largest cupcakes first

   Is this a Greedy Algorithm? No.

  A greedy algorithm makes the "locally optimal choice at each stage with the hope of    
  finding a global optimum" - Wikipedia. Our solution actually makes the locally LEAST 
  optimal choice at each stage, so it is not a greedy algorithm. Is there a name for  
  this approach? I'm not sure, but maybe we can call it a "reverse-greedy algorithm"

  Time Complexity: O(n log n)   */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class mc
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int calorie[] = new int[n];
        for(int i=0;i<n;i++)
            calorie[i] = sc.nextInt();

        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(calorie[j]<calorie[j+1])
                {
                    int temp = calorie[j];
                    calorie[j] = calorie[j+1];
                    calorie[j+1]=temp;
                }
            }
        }

        //Arrays.sort(calorie,Collections,reverseOrder());

        long sum = 0;
        for(int i=0;i<n;i++)
            sum += Math.pow(2,i) * calorie[i];

        System.out.println(sum);
    }
}
