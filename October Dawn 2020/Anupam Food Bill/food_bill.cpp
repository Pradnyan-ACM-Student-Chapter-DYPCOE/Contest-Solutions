#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        int sum = 0;
        string ans = "0";
        for(int i = 0; i<s.length(); i++)
        {
            if(isdigit(s[i]) != 0)
                ans += s[i];
            else{
                if(ans != "0")
                    sum += stoi(ans);
                ans = "0";
            }
        }
        if(ans != "0")
                    sum += stoi(ans);
        cout<<sum<<endl;
    }
    return 0;
}
