class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        } else {
            String num = x + "";
            int n = num.length() - 1;
            int i = 0;
            while (i <= n/2) {
                if (num.charAt(i) != num.charAt(n-i)) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }
}