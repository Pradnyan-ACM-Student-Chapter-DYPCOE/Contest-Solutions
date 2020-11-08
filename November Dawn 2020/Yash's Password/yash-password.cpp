#include <bits/stdc++.h>

using namespace std;
int main()
{
    string s;
    int l;
    cin>>l;
    cin>>s;
    int point1=0,point2=0,point3=0,point4=0,flag,count=0,need;
    string numbers = "0123456789";
    string lower_case = "abcdefghijklmnopqrstuvwxyz";
    string upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    string special_characters = "!@#$%^&*()-+";
    for(int i=0;i<s.length();i++)
    {   
        flag=0;
        for(int j=0;j<numbers.length();j++)
            if(s[i]==numbers[j])
            {
                point1++;
                flag=1;
                break;
            }
            if(flag == 1)
                continue;
        for(int j=0;j<lower_case.length();j++)
            if(s[i]==lower_case[j])
            {
                point2++;
                flag=1;
                break;
            }
            if(flag == 1)
                continue;
            for(int j=0;j<upper_case.length();j++)
            if(s[i]==upper_case[j])
            {
                point3++;
                flag=1;
                break;
            }
            if(flag == 1)
                continue;
            for(int j=0;j<special_characters.length();j++)
            if(s[i]==special_characters[j])
            {
                point4++;
                flag=1;
                break;
            }
            if(flag == 1)
                continue;    
    }
    if(point1==0)
        count++;
    if(point2==0)
        count++;
    if(point3==0)
        count++;
    if(point4==0)
        count++;
    if(l>6)
    cout<<count;
    else
    {
        need =7-l;
        int max = need>count ? need : count;
        cout<<max;
    }



}