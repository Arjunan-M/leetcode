class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> res= new ArrayList<Integer>();
        int l=nums.length;
        int []freq=new int[1001];
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                freq[nums[i][j]]++;
            }
        }
        for(int i=1;i<=1000;i++)
        {
            if(freq[i]==l)
            {
                res.add(i);
            }
        }
        return res;
    }
}