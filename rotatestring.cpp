// Atul Tirkey 21BCS5094//
class Solution {
public:
    bool rotateString(std::string s, std::string goal) {
        int lenS = s.length();
        int lenG = goal.length();

        if (lenS == lenG) {
            std::string combined_s = s + s;
            if (combined_s.find(goal) != -1)
                return true;
            else
                return false;
        } else {
            return false;
        }
    }
};
