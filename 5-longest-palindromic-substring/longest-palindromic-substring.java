class Solution {
    public String longestPalindrome(String s) {
          String s1="";
          int n=s.length();
          if(n<2)
          {
            return s;
          }
          for(int i=0;i<n;i++)
          {
            int l=i,r=i;
            while(l>=0&&r<n&&s.charAt(l)==s.charAt(r))
            {
                l--;
                r++;
            }
            String temp=s.substring(l+1,r);
             if( temp.length()>s1.length())
            {
                s1=temp;
            }

            l=i;
            r=i+1;
            while(l>=0&&r<n&&s.charAt(l)==s.charAt(r))
            {
                l--;
                r++;
            }
            temp=s.substring(l+1,r);

            if( temp.length()>s1.length())
            {
                s1=temp;
            }

          }
          return s1;
}      
}