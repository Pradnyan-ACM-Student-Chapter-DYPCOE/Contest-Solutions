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
            String n = sc.next();
            int total = 0;
            int num = 0;
            for(int i=0;i<n.length(); i++)
            {

                if(Character.isDigit(n.charAt(i)))
                {
                    int a = Integer.parseInt(String.valueOf(n.charAt(i)));
                    num = num*10 + a;
                }

                else if(Character.isAlphabetic(n.charAt(i)))
                {
                    total += num;
                    num = 0;
                }

            }
            total += num;
            System.out.println(total);

        }

    }

}
