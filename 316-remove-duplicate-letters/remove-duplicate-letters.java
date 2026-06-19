class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count=new int[26];
        for (int i=0;i<s.length();i++) {
            count[s.charAt(i)-'a']++;
        }
        StringBuilder stack=new StringBuilder();
        boolean[] visited=new boolean[26];
        for (int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            int idx=ch-'a';
            count[idx]--;
            if (visited[idx]) {
                continue;
            }
            while (stack.length()>0){
                char lastChar=stack.charAt(stack.length()-1);
                int lastIdx=lastChar-'a';
                
                if (lastChar>ch&&count[lastIdx]>0){
                    stack.deleteCharAt(stack.length()-1);
                    visited[lastIdx]=false;
                } else {
                    break;
                }
            }
            stack.append(ch);
            visited[idx] = true;
        }
        
        return stack.toString();
        
    }
}