class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l=0,r=0;
        Set<Integer> s=new HashSet<>();
        while(l<nums1.length && r<nums2.length)
        {   
            if(nums1[l]==nums2[r])
            {
                s.add(nums1[l]);
                l++;
                r++;
            }
            else if(nums1[l]<nums2[r])
            {
                l++;
            }
            else{
                r++;
            }
        }
        int []res=new int[s.size()];
        int k=0;
        for(int i:s)
        {
            res[k++]=i;
        }
        return res;
        }
    }