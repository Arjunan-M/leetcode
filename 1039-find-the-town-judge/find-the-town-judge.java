class Solution {
    public int findJudge(int n, int[][] trust) {
        int []trustscore=new int [n+1];
        for(int []res:trust)
        {
            int truster=res[0];
            int trustee=res[1];
            trustscore[truster]--;
            trustscore[trustee]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(trustscore[i]==n-1)
            {
                return i;
            }
        }
        return -1;
    }
}