class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<num.length();i++)
        {
            Character c=num.charAt(i);
            while(!s.isEmpty() && k>0 && s.peek()>c)
            {
                s.pop();
                k--;
            }
            s.push(c);
        }
        while(k>0)
        {
            s.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty())
        {
            sb.append(s.pop());
        }
        sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0') {
        sb.deleteCharAt(0);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}