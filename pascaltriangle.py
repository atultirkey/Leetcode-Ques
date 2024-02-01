class Solution(object):
    def generate(self, numRows):
        if numRows <= 0:
            return []
        
        triangle = []
        
        for i in range(numRows):
            row = [1] * (i + 1)
            
            if i >= 2:
                for j in range(1, i):
                    row[j] = triangle[i - 1][j - 1] + triangle[i - 1][j]
            
            triangle.append(row)
        
        return triangle