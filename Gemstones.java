import java.util.*;
public class g
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String num[] = new String[n];
        for(int i=0;i<n;i++)
            num[i] = sc.next();

        int mat[][] = new int[26][n];

        for(int i=0;i<n;i++)
        {
            String str = num[i];
            for(int j=0;j<str.length();j++)
            {
                char ch = str.charAt(j);
                mat[ch-'a'][i]++;
            }
        }
        int ctr=0;
        
        for(int i=0;i<26;i++)
        {
            int flag = 0;
            for(int j=0;j<n;j++)
                if(mat[i][j]==0)
                    flag=1;

            if(flag==0)
                ctr++;
        }
        System.out.print(ctr);
    }
}
