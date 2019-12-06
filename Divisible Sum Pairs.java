import java.util.*;
public class Records
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int score[] = new int[n];
    
        int max=0,min=0;
        int max2=sc.nextInt();
        int min2=max2;

        for(int i =1;i<n;i++)
        {
            score[i] = sc.nextInt();
            if(max2<score[i])
            {
                max2 = score[i];
                max++;
            }
            if(min2>score[i])
            {
                min2 = score[i];
                min++;
            }
        }
        System.out.println(max+" "+min);
    }
} 
