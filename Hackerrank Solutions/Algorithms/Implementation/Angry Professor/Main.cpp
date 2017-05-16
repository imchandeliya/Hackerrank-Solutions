
#include <iostream>
using namespace std;

int main(){
   int t;
    cin>>t;
    while(t>0)
        {
        	int n ,k;
        cin>>n;
         cin>>k;
         int A[n];
         int p=0;
        for(int i=0;i<n;i++)
            {
            cin>>A[i];
            if(A[i]<=0)
            p++;
        }
         if(p<k)
             cout<<"YES"<<"\n";
         else
             cout<<"NO"<<"\n";
        
        t--;
    }
    return 0;
}
