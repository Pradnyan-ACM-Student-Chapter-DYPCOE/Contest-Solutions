#include<bits/stdc++.h>
using namespace std;

 int main()
 {
     int t;
     cin>>t;
     while(t--)
     {
         int n;
         cin>>n;
         set <int> s;
         while(n--)
         {
             int temp;
             cin>>temp;
             s.insert(temp);
         }
        
        if(s.size()==1)
             cout<<-1<<endl;
         else
         {
            int k=s.size()-2;
            set<int>::iterator it =next(s.begin(), k);
             cout<<*it<<endl;
         }
     }
 }