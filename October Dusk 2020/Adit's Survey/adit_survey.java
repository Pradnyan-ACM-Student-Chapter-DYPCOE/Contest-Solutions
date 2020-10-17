import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] bill = new int[n];
        
        for(int i=0;i<n;i++)
        {
            int a = sc.nextInt();
            a *= 8;
            if(a<250)
                bill[i] = 250;
            else
                bill[i] = a;
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.print(bill[i] + " ");
        }
        
    }
}