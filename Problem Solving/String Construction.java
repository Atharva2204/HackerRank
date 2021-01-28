import java.util.*;
public class sc
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();        
        
        for(int i = 0; i < n; i++)
        {
            String s = sc.next();
            
            Set<Character> uniqueChars = new HashSet<>();
            for(char c : s.toCharArray())
                uniqueChars.add(c);
            
            System.out.println(uniqueChars.size());
        }
    }
}
