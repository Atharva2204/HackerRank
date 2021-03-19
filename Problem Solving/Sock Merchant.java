import java.util.*;
public class Merc
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int colour[] = new int[n];
        for(int i = 0;i<n;i++)
            colour[i] = sc.nextInt();

        Arrays.sort(colour);
        int count=0;

        for(int i =0;i<n-1;i++)
        {
            if(colour[i]==colour[i+1])    // if(i<n && colour[i]==colour[i+1])  more appropriate
            {
                count++;
                i+=1;
            }
        }
        System.out.println(count);
    }
}
