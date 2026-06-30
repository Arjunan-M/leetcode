class Solution {
    public int mySqrt(int x) {
        int l=1,r=x;
        int mid=-1;
        if(x==1||x==0)
            return x;
        while(l<=r){
            mid=l+(r-l)/2;
            if(mid*mid==x)
                return mid;
            else if((long)mid*mid>(long)x)
            {
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return Math.round(r);
    }
}