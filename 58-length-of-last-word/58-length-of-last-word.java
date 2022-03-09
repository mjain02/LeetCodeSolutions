class Solution {
    public int lengthOfLastWord(String s) {
        int li = s.lastIndexOf(' ');
        if (li == -1) {
            return s.length();
        }
        s = s.trim();
        li = s.lastIndexOf(' ');
        return s.substring(li+1).length();
    }
}