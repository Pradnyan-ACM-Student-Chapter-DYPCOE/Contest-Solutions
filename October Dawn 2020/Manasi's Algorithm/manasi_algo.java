import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        for(int q=0;q<test;q++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int a_rev = reverse(a);
            int b_rev = reverse(b);

            int sum = a_rev + b_rev;

            int sum_rev = reverse(sum);

            System.out.println(sum_rev);
        }

    }

    public static int reverse(int n)
    {
        int newnum = 0;
        while(n != 0)
        {
            int t = n%10;
            newnum = newnum*10 + t;
            n = n/10;
        }

        return newnum;
    }
}
