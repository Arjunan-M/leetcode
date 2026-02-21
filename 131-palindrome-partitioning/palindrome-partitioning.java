class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> re=new ArrayList<>();
        dfs(0,res,re,s);
        return res;

    }
    public void dfs(int i,List<List<String>>res,List<String> path,String s)
    {
        if(i==s.length())
        {
            res.add(new ArrayList<>(path));
            return;
        }
    
        for(int end=i+1;end<=s.length();end++)
        {
            if(is_palindrome(s,i,end-1))
            {
                path.add(s.substring(i,end));
                dfs(end,res,path,s);
                path.remove(path.size()-1);
            }
        }

    }
    public boolean is_palindrome(String s,int st,int end)
    {
        while(st<end)
        {
            if(s.charAt(st)!=s.charAt(end))
            {
                return false;
            }
            else{
                st++;
                end--;
            }
        }
        return true;
    }
}