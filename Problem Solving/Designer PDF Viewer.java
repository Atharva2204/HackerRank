import java.util.*;
public class pdf
{
    public static void main(String argd[])
    {
        Scanner sc = new Scanner(System.in);

        int h[] = new int[26];
        for(int i =0;i<26;i++)
            h[i] = sc.nextInt();

        String word = sc.next();
        int maxheight =0;

        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            int x = (int)ch;

            for(int j = 0; j<26 ;j++)
            {
                if(x==(j+97))
                {
                    maxheight = Math.max(h[j],maxheight);
                    //break;
                }
            }
        }

        /*  for (int i = 0; i < str.length(); i++) 
            {
                int index = str.charAt(i) - 'a';
                maxHeight = Math.max(maxHeight, height[index]);
            }
        */

        int area = maxheight*word.length();
        System.out.println(area);
    }
}
