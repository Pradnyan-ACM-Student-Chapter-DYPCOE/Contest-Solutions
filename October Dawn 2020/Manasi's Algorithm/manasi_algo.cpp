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
        string s1, s2;
        cin>>s1>>s2;
        reverse(s1.begin(), s1.end());
        reverse(s2.begin(), s2.end());
        string s3 = to_string(stoi(s1)+stoi(s2));
        reverse(s3.begin(), s3.end());
        cout<<stoi(s3)<<endl;
    }
    return 0;
}
