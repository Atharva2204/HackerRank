import java.util.*;
public class Chocolate
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();

            int choco = n/c;
            int temp = 0,sum=choco;

            while(choco>=m)
            {     
                sum+=choco/m; 

                temp = choco%m; 
                choco = choco/m;                 
                choco = choco+temp;                                     
            }
            System.out.println(sum);
        }
    }
}
