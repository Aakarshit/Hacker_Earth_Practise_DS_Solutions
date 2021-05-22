#include<bits/stdc++.h>
using namespace std;

int main()
{
	int t;
    cin>>t;
	while(t--){
		long long ans=0;
		int n,k;
		cin>>n>>k;
        multiset<long long> bags;
        for(int i=0;i<n;i++){
            long long x;
            cin>>x;
            bags.insert(x);
        }
        while(k--){
            auto it=(--bags.end());
            long long candy=*it;
            ans+=candy;
            bags.erase(it);
            bags.insert(candy/2);
        }
        cout<<ans<<endl;
		
	}
	return 0;
}