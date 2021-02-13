import java.util.*;
public class Movie
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        int rev=0;
        int temp=0;
        int ctr=0;
        
        for(int a = i;a<=j;a++)
        {
            rev=0; 
            int temp2=a;          
            while(temp2!=0)
            {
                temp = temp2%10;
                temp2 = temp2/10;
                rev =  (rev*10)+temp;
            }
            if(Math.abs(a-rev)%k == 0)
                ctr++;
        }
        System.out.println(ctr);      
   }
}
