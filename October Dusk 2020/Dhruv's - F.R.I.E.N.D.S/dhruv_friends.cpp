#include <bits/stdc++.h>
#define lli long long int
#define endl "\n"
#define MAX 1000005
#define MOD 1000000007
using namespace std;

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    string s1, s2,s3;
    cin>>s1>>s2>>s3;
    map <char,int >mp1;
    mp1['A'] = 0;
    mp1['S'] = 0;
    mp1['R'] = 0;
    if(s1[1] == '>')
        mp1[s1[0]]++;
    else
        mp1[s1[2]]++;
    if(s2[1] == '>')
        mp1[s2[0]]++;
    else
        mp1[s2[2]]++;
    if(s3[1] == '>')
        mp1[s3[0]]++;
    else
        mp1[s3[2]]++;
    
    if((mp1['A'] == mp1['S']) || (mp1['R'] == mp1['S']) || (mp1['A'] == mp1['R']))
        cout<<"Impossible";
    else{
        for(auto c: mp1)
        if(c.second == 0)
            cout<<c.first;
    for(auto c: mp1)
        if(c.second == 1)
            cout<<c.first;
    for(auto c: mp1)
        if(c.second == 2)
            cout<<c.first;
    }
    
    return 0;
}