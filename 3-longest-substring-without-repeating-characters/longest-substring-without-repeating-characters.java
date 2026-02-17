import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
         int n=s.length();
                 int l=0,res=0;
                 Set<Character> seen = new HashSet<>();
                 for(int r=0;r<n;r++)
                 {
                    while(seen.contains(s.charAt(r)))
                    {
                        seen.remove(s.charAt(l));
                        l++;
                    }
                    seen.add(s.charAt(r));
                    res=Math.max(res,r-l+1);
                 }
                 return res;
    }
    }