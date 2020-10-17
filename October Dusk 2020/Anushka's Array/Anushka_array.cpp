#include <bits/stdc++.h>
using namespace std;

int kadane(vector <int> v1) 
{ 
    int global = 0, local = 0; 
    for (int i = 0; i < v1.size(); i++) 
    { 
        local += v1[i]; 
        if (global < local) global = local; 
        if (local < 0) local = 0; 
    } 
    return global; 
} 

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int t;
    cin>>t;
    while(t--)
    {
        int n,count = 0;
        cin>>n;
        vector <int> v1(n);
        char c;
        for(int i =0; i<n; i++)
        {
            cin>>c;
            if(c == 'X'){
                v1[i] = -1;
                count++;
            }
            else   
                v1[i] = 1;
        }
        cout<<count+kadane(v1)<<endl;
        
    }
    return 0;
}
