#include <bits/stdc++.h>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int t;
    cin>>t;
    while(t--)
    {
        long int n1, n2;
        cin>>n1>>n2;
        cout<<__builtin_popcount(n1^n2)<<endl;
    }
    return 0;
}
