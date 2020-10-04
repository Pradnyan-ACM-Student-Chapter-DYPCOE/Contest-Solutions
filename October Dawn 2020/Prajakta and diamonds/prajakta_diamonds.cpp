#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

#include <bits/stdc++.h>
# define lli long long int
using namespace std;
lli kConcatenationMaxSum(vector<lli>& arr, int k) {
        int M = 1e9 + 7;
        long long int max_sum=0;
        long long int sum=0;
     if(k==1)
        {
            for(lli j=0;j<arr.size();j++)
            {
                sum=max((long long int )arr[j],sum+(long long int )arr[j]);
                sum=sum;
                max_sum=max(sum,max_sum);
                max_sum=max_sum;
            }
            return max_sum;
        }
        for(int i=0;i<2;i++)
        {
            for(lli j=0;j<arr.size();j++)
            {
                sum=max((long long int )arr[j],sum+(long long int )arr[j]);
                sum=sum;
                max_sum=max(sum,max_sum);
                max_sum=max_sum;
            }
        }
        long long int min_sum=0;
        for(int i=0;i<arr.size();i++)
        {
            min_sum+=arr[i];
        }
        if(min_sum<0)
        {
            return max_sum;
        }
        else
        {
            
            max_sum=(max_sum+((k-2)*(min_sum))%M);
        }
        return max_sum;
    }
int main() {
    int t;
    cin>>t;
    while(t--)
    {
        lli n,x,m;
    cin>>n>>m;
    
    vector<lli>arr;
    for(lli i=0;i<n;i++)
    {
        cin>>x;
        arr.push_back(x);
    }
    cout<<kConcatenationMaxSum(arr,m)<<endl; 
    }
    return 0;
}