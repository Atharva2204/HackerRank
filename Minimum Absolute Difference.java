import java.util.*;
public class mad
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++)
            num[i]=sc.nextInt();
        
        int min=999999;                            
        
        /*for(int i=0;i<n;i++) 
        {
            for(int j=i+1;j<n;j++)
            {
                int diff = Math.abs(num[i]-num[j]);
                min= Math.min(diff,min);
            }
        }
This logic is correct but it is giving terminated due to timeout error which means time required is more for execution  */

        Arrays.sort(num);
        for(int i=0;i<n-1;i++) 
        {
                int diff = Math.abs(num[i]-num[i+1]);
                min= Math.min(diff,min);
        }
        System.out.println(min);
    }
}
