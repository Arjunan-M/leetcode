class Solution {
    public void sortColors(int[] nums) {
        int l=0,r=nums.length-1,mid=0;
        while(mid<=r)
        {
            if (nums[mid]==0)
            {
                int t=nums[mid];
                nums[mid]=nums[l];
                nums[l]=t;
                l++;
                mid++;
            }
            else if(nums[mid]==2){
                int t=nums[r];
                nums[r]=nums[mid];
                nums[mid]=t;
                r--;
            }
            else{
                mid++;
            }
        }
    }
}