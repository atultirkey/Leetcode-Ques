class Solution {
public:
    int jump(vector<int>& nums) {
        for(int i=1;i<nums.size();i++){
            nums[i]=max(nums[i]+1,nums[i-1]);
        }

        int ant=0;
        int ans=0;
        while(ant<nums.size()-1){
            ans++;
            ant=nums[ant];
            }
            return ans;
        }
};