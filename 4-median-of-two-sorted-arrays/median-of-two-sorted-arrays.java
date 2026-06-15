class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int []arr = new int[n];
        int index=0;
        int n1=nums1.length,n2=nums2.length;
        int i=0,j=0;
        while(i<n1 && j<n2)
        {
            if(nums1[i]<=nums2[j])
            {
                arr[index++]=nums1[i++];
            }
            else{
                arr[index++]=nums2[j++];
            }
        }
        while(i<n1)
        {
            arr[index++]=nums1[i++];
        }
        while(j<n2)
        {
            arr[index++]=nums2[j++];
        }
        if (n%2!=0)
        {
            return (double)arr[n/2];
        }
        return (double)(arr[n/2]+arr[(n/2)-1])/2.0;
    }
}