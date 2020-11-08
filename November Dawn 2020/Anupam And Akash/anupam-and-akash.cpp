#include<bits/stdc++.h>
//#define REP(1,n) for(int i=1;i<=n;i++)
#define mod 1000000007
#define pb push_back
#define ff first
#define ss second
#define ii pair<int,int>
#define vi vector<int>
#define vii vector<ii>
//#define lli long long int
#define inf 1000000000
 
using namespace std;
 
int main()
{
    int n,w;
    cin>>n>>w;
    int sum=0;
    int A[n];
    for(int i=0;i<n;i++)
    {
        cin>>A[i];
        sum+=A[i];
    }
    if(sum+10*(n-1)>w)
    cout<<"-1";
    else
    cout<<(w-sum)/5;
    
    return 0;
}