#include <bits/stdc++.h>
#define lli long long int
using namespace std;


int main() {
    int n;
    cin>>n;
    int sp = 1;
    for(int i=0; i<n;i++)
    {
        for(int j=0;j<n-sp;j++)
            cout<<" ";
        for(int k=0; k<n; k++)
            cout<<"* ";
        cout<<endl;
        sp++;
    }
    
    return 0;
}