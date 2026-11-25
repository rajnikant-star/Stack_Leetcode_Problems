class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> x = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (x.isEmpty() || x.peek() != s.charAt(i)) x.push(s.charAt(i));
            else x.pop();
        }
        s = "";
        while (!x.isEmpty()) {
            s = x.peek() + s;
            x.pop();
        }
        return s;
    }
}