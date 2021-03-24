import java.util.*;
public class Tree
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int n[] = new int[t];
        for(int i =0;i<t;i++)
            n[i] = sc.nextInt();

        for(int i =0;i<t;i++)
        {
            int height =0;
            for(int j=0;j<60;j++)
            {                
                if(j%2==0)
                    height++;
                else
                    height*=2;     

                if(j==n[i])
                    System.out.println(height);
            }            
        }

        /*  Solution by github
        
        int maxCycles = Arrays.stream(testcase).max().getAsInt();
        int [] cache = new int[maxCycles + 1]; // cache is crucial to increase runtime
        cache[0] = 1;
        for (int i = 1; i <= maxCycles; i++) 
        {
            if (i % 2 == 1) 
                cache[i] = cache[i-1] * 2; 
            else 
                cache[i] = cache[i-1] + 1;
        }

        for (int i = 0; i < T; i++) {
            System.out.println(cache[testcase[i]]);     */ 

    }
}
