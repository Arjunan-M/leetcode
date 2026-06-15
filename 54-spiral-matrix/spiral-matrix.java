class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<Integer>();
        int rb=0;
        int re=matrix.length-1;
        int cb=0;
        int ce=matrix[0].length-1;
        while(rb<=re && cb<=ce)
        {
            for(int i=cb;i<=ce;i++)
            {
                l.add(matrix[rb][i]);
            }
            rb++;
            for(int i=rb;i<=re;i++)
            {
                l.add(matrix[i][ce]);    
            }
            ce--;
            if(rb<=re)
            {
                for(int i=ce;i>=cb;i--)
                {
                    l.add(matrix[re][i]);
                }
                re--;
            }
            if(cb<=ce)
            {
                for(int i=re;i>=rb;i--)
                {
                    l.add(matrix[i][cb]);
                }
                cb++;
            }
        }
        return l;
    }
}