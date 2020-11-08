import java.util.*;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0, count1= 0;
        int maxi = 0;

        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) == '0')
            {
                count++;
                count1++;
            }
            else
            {
                count--;
                count1++;
            }

            if(count == 0)
            {
                maxi = Math.max(count1, maxi);
                count1 = 0;
            }
        }

        System.out.println(maxi);

    }
}
