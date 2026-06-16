class Solution {
    public double myPow(double x, int n) {
        double p=1;
        if(n<0)
        {
            n=-n;
            x=1/x;
        }
        while(n!=0)
        {
            if((n&1)!=0)
            {
                p*=x;
                
            }
            x*=x;
            n>>>=1;
        }
        return p;
    }
}