import java.util.*;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String s = sc.next();

        int p1 = 0, p2 = 0, p3 = 0, p4 = 0, count = 0;
        int flag = 0, need = 0;

        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        for(int i=0;i<s.length();i++)
        {
            flag = 0;
            for(int j=0;j < numbers.length(); j++)
            {
                if(s.charAt(i) == numbers.charAt(j))
                {
                    p1++;
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
                continue;

            for(int j=0;j < lower_case.length();j++)
            {
                if(s.charAt(i) == lower_case.charAt(j))
                {
                    p2++;
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
                continue;

            for(int j=0;j < upper_case.length();j++)
            {
                if(s.charAt(i) == upper_case.charAt(j))
                {
                    p3++;
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
                continue;

            for(int j=0;j < special_characters.length();j++)
            {
                if(s.charAt(i) == special_characters.charAt(j))
                {
                    p4++;
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
                continue;
        }

        if(p1 == 0)
            count++;
        if(p2 == 0)
            count++;
        if(p3 == 0)
            count++;
        if(p4 == 0)
            count++;

        if(l > 6)
            System.out.println(count);
        else
        {
            need = 7-l;
            int max = (need > count)? need: count;
            System.out.println(max);
        }

    }
}