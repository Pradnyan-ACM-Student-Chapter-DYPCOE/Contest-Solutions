import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char arr[][] = new char[n][3];
        int count = 0;
        for(int i=0;i<n;i++)
        {
            arr[i][0] = sc.next().charAt(0);
            arr[i][1] = sc.next().charAt(0);
            arr[i][2] = sc.next().charAt(0);

            if(arr[i][0] == 'Y' && arr[i][1] == 'Y')
                count++;
            else if(arr[i][1] == 'Y' && arr[i][2] == 'Y')
                count++;
            else if(arr[i][0] == 'Y' && arr[i][2] == 'Y')
                count++;

        }

        System.out.println(count);

    }
}