import java.util.*;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] A = new int[n];
        int sum = 0;

        for(int i=0;i<n;i++)
        {
            A[i] = sc.nextInt();
            sum += A[i];
        }

        if(sum + 10 * (n-1) > w)
            System.out.println("-1");
        else
            System.out.println((w-sum)/5);
    }
}