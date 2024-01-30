class Solution {
public:
    bool isMatchingpattern(string &s,string &pattern,int i,int j)
    {
        if(i==s.length())
        {
            return j>=pattern.length();
        }
        if(s[i]==pattern[j])
        {
            return isMatchingpattern(s,pattern,i+1,j+1);
        }
        else
        {
            if(s[i]>='a' && s[i]<='z')
            {
                return isMatching(s,pattern,i+1,j);
            }
            else
            {
                return false;
            }
        }
    }
    vector<bool> camelMatch(vector<string>& queries, string pattern) {
        vector<bool>ans;
        for(int i=0;i<queries.size();i++)
        {
            ans.push_back(isMatching(queries[i],pattern,0,0));
        }
        return ans;
    }
};