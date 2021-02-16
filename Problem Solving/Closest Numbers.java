import java.util.*;
public class cn
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i=0;i<n;i++)
            num[i] = sc.nextInt();

        Arrays.sort(num);
        int min = Integer.MAX_VALUE;

        String output = "";

        for(int i=0;i<n-1;i++)
            if(num[i+1]-num[i] < min)
                min = num[i+1]-num[i];

        for(int i=0;i<n-1;i++)
            if(num[i+1]-num[i]==min)
                output += num[i] + " " +num[i+1]+" ";

        System.out.println(output);
    }
}
