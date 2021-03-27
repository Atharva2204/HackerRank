import java.util.*;
public class Add
{
    public static void main(String ask[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int shared = 5;
        int sum = 0;;

        for(int i =0 ; i<n ; i++)
        {
            int like = (int)Math.floor(shared/2);
            shared = like*3;
            sum += like;
        }

        System.out.println(sum);
    }
}

