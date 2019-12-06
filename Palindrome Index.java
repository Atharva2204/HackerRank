import java.util.*;
public class PI
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        /*for(int i=0;i<q;i++)
        {
            String str = sc.next();
            String newstr = str;
            for(int j=0;j<=str.length();j++)
            {
                String rev="";
                for(int k=0;k<newstr.length();k++)
                    rev = newstr.charAt(k)+rev;

                if(rev.equals(newstr))
                {
                    if(j==0)
                        System.out.println(-1);
                    else
                        System.out.println(j-1);
                    break;
                }
                
                if(j<str.length())
                    newstr = str.substring(0,j)+str.substring(j+1);
            }
        }*/

        for (int i = 0; i < q; i++) 
        {
            String str = sc.next();
            System.out.println(findRemovalIndex(str));
        }
    }

    static int findRemovalIndex(String str) 
    {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) 
            if (str.charAt(i) != str.charAt(j)) 
                return isPalindrome(str, i + 1, j) ? i : j;
        return -1;
    }

    static boolean isPalindrome(String str, int beginIndex, int endIndex) 
    {
        for (int i = beginIndex, j = endIndex; i < j; i++, j--) 
            if (str.charAt(i) != str.charAt(j)) 
                return false;
        return true;
    }
}
