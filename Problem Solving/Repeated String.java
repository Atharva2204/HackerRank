import java.util.*;
public class string
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        long n = sc.nextLong();

        int wordAs = 0;
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)=='a')
                wordAs++;

        long completewords = n/str.length();
        long remainingletters = n%str.length();
        long totalAs = completewords*wordAs;

        // Count up the remaining 'a' characters 
        for (int i = 0; i < remainingletters; i++) 
            if (str.charAt(i) == 'a') 
                totalAs++;

        System.out.println(totalAs);
    }
}
