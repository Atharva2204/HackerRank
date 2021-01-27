/*
Initial Thoughts:
Build a HashSet of the weights by iterating through
the string keeping track of weight  O(s) time and space
Then iterate through our queries checking if they 
are in the HashSet O(n) time and O(1) space
Time Complexity: O(s + n) 
Space Complexity: O(n)
*/


import java.util.*;
public class wus
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        int n = sc.nextInt();
        
        //Build a set of weights
        Set<Integer> weights = new HashSet<>();
        
        int currentWeight = 0;
        char prevLetter = ' ';
        for(char letter : s.toCharArray())
        {
            if(letter != prevLetter)
                currentWeight = letter - 'a' + 1;
            else
                currentWeight += letter - 'a' + 1;
            
            prevLetter = letter;
            weights.add(currentWeight);
        }
        
        for(int i = 0; i < n; i++)
        {
            int x = sc.nextInt();
            
            if(weights.contains(x))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
