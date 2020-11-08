import java.util.*;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 1;
        for(int i=0;i<n;i++)
        {
            for(int j = 0; j < n-sp; j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            sp++;
        }
    }
}