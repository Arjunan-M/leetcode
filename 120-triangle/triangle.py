class Solution:
    def minimumTotal(self, triangle: List[List[int]]) -> int:
        for i in range(len(triangle)-2,-1,-1):
            n=len(triangle[i])
            for j in range(n):
                left=triangle[i+1][j]
                right=triangle[i+1][j+1]
                triangle[i][j]+=min(left,right)
        return triangle[0][0]