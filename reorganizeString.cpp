class Solution {
public:
    string reorganizeString(string s) {
        int sz = s.size();
        vector<int> v(26,0);
        for(int i = 0;i<sz;++i){
            v[s[i]-'a']++;
            if(v[s[i]-'a'] > (sz+1)/2){return "";}
        }
        map<char,ll> mp;
        for(int i = 0;i<26;++i){
            if(v[i]){
                mp[i+'a'] = v[i];
            }
        }

        multiset<pair<ll,char>> ms;
        for(auto it:mp){
            ms.insert({it.second,it.first});
        }
        
        string tmp;
        while(!ms.empty()){
            auto p = *ms.rbegin();ms.erase(p);
            while(p.first--){
                tmp += p.second;
            }
        }
        s.clear();s = tmp;

        vector<char> ok(sz);
        int i = 0,j = 0,n = sz;
        while(n--){   
            ok[i] = s[j];
            i += 2;++j;
            if(i >= sz){
                i = 1;
            }
        }
        string ans;
        for(auto it:ok){ans += it;}
        return ans;
    }
};