import java.util.*;
public class mn
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num1[] = new int[n];
        for(int i=0;i<n;i++)
            num1[i]= sc.nextInt();
      
        int m = sc.nextInt();
        int num2[] = new int[m];

        int min = Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {
            num2[i]= sc.nextInt();          // original array
            if(min>num2[i])
                min = num2[i];
        }

        int miss[] = new int[100];
        /*int ctr=0;
        for(int i=0;i<m;i++)                // This logic is correct but time complexity                                                   increases very much
        {
            int ctr1=0,ctr2=0;
            for(int j=0;j<m;j++)
            {
                if(j<n && num2[i]==num1[j])
                    ctr2++;
                if(num2[i]==num2[j])
                    ctr1++;
            }
            if(ctr1!=ctr2)
                miss[ctr++]=num2[i];
        }
        Arrays.sort(miss);
        //System.out.println(miss[0]);

        for(int i=1;i<miss.length;i++)
        {
            if(miss[i]!=miss[i-1])
                System.out.print(miss[i]+" ");
        }*/

        for(int i=0;i<n;i++)
            miss[num1[i]-min]++;

        for(int i=0;i<m;i++)
            miss[num2[i]-min]--;

        for(int i=0;i<100;i++)
            if(miss[i]!=0)
                System.out.print(min+i+" ");
    }
}
