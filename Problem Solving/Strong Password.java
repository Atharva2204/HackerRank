/*1. Count characters of each group in given string. Groups: digit, lower-case, upper-case and        special characters
  2. Add one of each group to the string if not already present i.e. count is 0.
  3. Add required number of characters in case length of the string is less than 6.*/


import java.util.Scanner;
class StrongPassword
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        int digitcount = 0;
        int uppercount = 0;
        int lowercount = 0;
        int specialcount = 0;
        int addcount = 0;

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
                digitcount++;
            else if(Character.isUpperCase(ch))
                uppercount++;
            else if(Character.isLowerCase(ch))
                lowercount++;
            else
                specialcount++;
        }

        if(digitcount==0)
        {
            addcount++;      // add a digit
            digitcount++;
        }
        if(uppercount==0)
        {
            addcount++;     // add a upper case character
            uppercount++;
        }
        if(lowercount==0)
        {
            addcount++;      // add a lower case character
            lowercount++;
        }
        if(specialcount==0)
        {
            addcount++;        // add a special character
            specialcount++;
        }
        
        int total = digitcount + uppercount + lowercount + specialcount;

        if(total<6)
            addcount+=6-total;
        
        System.out.println(addcount);
    }
}
