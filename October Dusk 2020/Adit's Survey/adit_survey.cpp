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
    while(n--)
    {
        int data;
        cin>>data;
        int ans = data*8;
        if(ans < 250)
            cout<<250<<" ";
        else
            cout<<ans<<" ";
    }
    return 0;
}