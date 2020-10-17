import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        for(int q=0;q<test;q++)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            
            int i, first, second;

              if (n < 2) 
              {
                System.out.println(-1);
              }
              else
              {
                  Arrays.sort(arr);
                  int flag = 0;
                  for (i = n - 2; i >= 0; i--) 
                  {
                    if (arr[i] != arr[n - 1]) 
                    {
                      System.out.println(arr[i]);
                        flag = 1;
                        break;
                    }
                  }
                  if(flag == 0)
                    System.out.println(-1);
              }
        }
        
    }
}
