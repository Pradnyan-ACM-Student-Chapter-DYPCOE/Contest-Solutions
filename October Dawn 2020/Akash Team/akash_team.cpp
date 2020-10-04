#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int nn;
    cin>>nn;
    int count1=0;
    int count=0;
    while(nn--)
    {
        count=0;
        char a,b,c;
        cin>>a>>b>>c;
        if(a=='Y')
        {
            count++;
        }
       if(b=='Y')
        {
            count++;
        }
        
       if(c=='Y')
        {
            count++;
        }
        if(count>1)
        {
            count1++;
        }
    }
    cout<<count1<<endl;
    return 0;
}
