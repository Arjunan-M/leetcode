class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character ,Character> m= new HashMap<>();
        Map<Character ,Character> m2= new HashMap<>();
        for (int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(m.containsKey(c1))
            {
                if(m.get(c1)!=c2)
                    return false;
            }
            else
            {
                if(m2.containsKey(c2))
                    return false;
                m.put(c1,c2);
                m2.put(c2,c1);
            }
            
            
        }
        return true;
    }
}