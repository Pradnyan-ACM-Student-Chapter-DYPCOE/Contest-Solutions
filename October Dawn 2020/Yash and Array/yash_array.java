import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(in.readLine());
        String[] str = in.readLine().split(" ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(str[i]);

        int k = Integer.parseInt(in.readLine());
        for(int i=0;i<k;i++)
        {
            String q = in.readLine();
            if(q.charAt(0) == 'L')
            {
                int temp = arr[0];
                for(int j=0;j<n-1;j++)
                {
                    arr[j] = arr[j+1];
                }
                arr[n-1] = temp;
            }
            else if(q.charAt(0) == 'R')
            {
                int temp = arr[n-1];
                for(int j=n-1;j>0;j--)
                {
                    arr[j] = arr[j-1];
                }
                arr[0] = temp;
            }
            else if(q.charAt(0) == 'I')
            {
                int add = Integer.parseInt(q.substring(2));
                for(int j=0;j<n;j++)
                    arr[j] += add;
            }
            else if(q.charAt(0) == 'D')
            {
                int sub = Integer.parseInt(q.substring(2));
                for(int j=0;j<n;j++)
                    arr[j] -= sub;
            }
        }

        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");

    }

}
