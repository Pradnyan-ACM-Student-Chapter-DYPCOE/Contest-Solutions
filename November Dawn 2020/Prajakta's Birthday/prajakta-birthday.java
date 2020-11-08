import java.util.*;
public class Birthday
{
    public static long fact(int n)
    {
        long res = 1;
        for(int i=2; i <= n; i++)
            res *= i;
        return res;
    }

    public static long nCr(int n, int r)
    {
        return fact(n) / ((fact(r) * fact(n-r)));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(nCr(n, n/2)*(fact((n/2)-1)* (fact((n/2)-1)))/2);
    }
}
