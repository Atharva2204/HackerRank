import java.util.*;
public class Cat
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        
        for(int i =0; i<q;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if(Math.abs(z-x) < Math.abs(z-y))
                System.out.println("Cat A");
            else if(Math.abs(z-x) > Math.abs(z-y))
                System.out.println("Cat B");
            else
                System.out.println("Mouse C");
        }
    }
}
