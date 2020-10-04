import java.io.*;
import java.util.*;
public class kadanesAlgo
{
    public static long kConcatenationMaxSum(long[] arr, int k)
    {
        long M = 1000000007;
        long max_sum=0;
        long sum=0;
        if(k==1)
        {
            for(int j=0;j<arr.length;j++)
            {
                sum=Math.max(arr[j],sum+arr[j]);
                //sum=sum;
                max_sum=Math.max(sum,max_sum);
                //max_sum=max_sum;
            }
            return max_sum;
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                sum=Math.max(arr[j],sum+arr[j]);
                //sum=sum;
                max_sum=Math.max(sum,max_sum);
                //max_sum=max_sum;
            }
        }
        long min_sum=0;
        for(int i=0;i<arr.length;i++)
        {
            min_sum+=arr[i];
        }
        if(min_sum<0)
        {
            return max_sum;
        }
        else
        {

            max_sum=(max_sum+((k-2)*(min_sum))%M);
        }
        return max_sum;
    }

    public static void main(String[] args)
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int q=0;q<t;q++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();

            long[] arr = new long[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            long ans = kConcatenationMaxSum(arr, m);
            System.out.println(ans);
        }

    }
}
