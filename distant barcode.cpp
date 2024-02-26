class Solution {
public:
    vector<int> rearrangeBarcodes(vector<int>& barcodes) {
        int n =  barcodes.size();
        unordered_map<int, int> map;
        priority_queue<pair<int , int>>max;

        for(auto i : barcodes){
            map[i]++;
        }
       
        vector<int> ans;

        for(auto i : map){
            max.push({i.second, i.first});
        }

        while(max.size() > 0){
            pair<int, int> temp1 = max.top();
            max.pop();
            ans.push_back(temp1.second);
            temp1.first--;

            if(max.size() > 0){
                pair<int, int> temp2 = max.top();
                max.pop();
                ans.push_back(temp2.second);
                temp2.first--;
                if(temp2.first > 0){
                    max.push(temp2);
                }
            }
            if(temp1.first > 0){
                max.push(temp1);
            }
        }

        return ans;
    }
};