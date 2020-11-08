#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int n;
    cin>>n;
    string s;
    cin>>s;
    int count=0,count1=0;
    int maxi=0;
    
    for(int i=0;i<n;i++)
    {
        if(s[i]=='0')
        {
            count++;
            count1++;
        }
        else
        {
            count--;
            count1++;
        }
        if(count==0)
        {
            maxi=max(count1,maxi);
            count1=0;
            
        }
    }
    cout<<maxi<<endl;
    return 0;
}