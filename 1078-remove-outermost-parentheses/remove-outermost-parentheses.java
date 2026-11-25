class Solution {
    String ans;

    public String removeOuterParentheses(String s) {
        int n = s.length();
        ans = "";
        solve(0, n-1, s);
        return ans;
    }

    public void solve(int start, int end, String s)
    {
        Stack<Character> st = new Stack<>();
        int lastStart = start; 
        for(int i = start; i <= end; i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
                st.push(ch);
            else
            {
                st.pop();

                if(st.isEmpty())
                {
                    removeOuter(lastStart, i, s);
                    lastStart = i + 1;
                }
            }
        } 
    }

    public void removeOuter(int start, int end, String s)
    {
        ans += s.substring(start+1, end);
    }
}