class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        } else {
            String num = x + "";
            int n = num.length() - 1;
            String rev = "";
            while (n >= 0) {
                rev += num.charAt(n--) + "";
            }
            return rev.equals(num);
        }
    }
}