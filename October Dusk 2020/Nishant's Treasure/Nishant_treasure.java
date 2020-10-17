import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int q=0;q<t;q++)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            int count = 0; 
            for (int i = 0; i < 32; i++) { 
                if (((A >> i) & 1) != ((B >> i) & 1)) { 
                    count++; 
                } 
            } 
            
            System.out.println(count);
        }
        
    }
}