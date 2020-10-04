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
    vector <int> v1(n);
    for(int i =0; i<n; i++)
        cin>>v1[i];
    int k;
    cin>>k;
    while(k--)
    {
        char c;
        cin>>c;
        if(c == 'L'){
            rotate(v1.begin(), v1.begin()+1, v1.end());
        }
        else if(c == 'R')
        {
            rotate(v1.begin(), v1.begin() + v1.size() -1, v1.end());
        }
        else if(c == 'I')
        {
            int add;
            cin>>add;
            for(int i = 0; i<n;i++)
                v1[i] += add;
        }
        else
        {
            int add;
            cin>>add;
            for(int i = 0; i<n;i++)
                v1[i] -= add;
        }
    }
    for(auto cs: v1)
        cout<<cs<<" ";
    return 0;
}
