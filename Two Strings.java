import java.util.*;
public class GOT
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int freq[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            freq[(int)ch-97]++;
        }

        String ans = "YES";
        int singlefound=0;
        int ctr=0;

        for(int i=0;i<26;i++)
        {
            if(freq[i]%2!=0)
            {
                ctr++;
                            /*if(singlefound==0)
                                singlefound=1;
                            else
                            {
                                ans = "NO";
                                break;
                            }*/
            }
        }
        //System.out.println(ans);

        if(ctr>1)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
