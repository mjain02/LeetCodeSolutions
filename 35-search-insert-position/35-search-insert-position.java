class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        int first = 0, last = nums.length - 1, mid;
        int index = 0;
        while (first <= last) {
            mid = (first + last)/2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                last = mid - 1;
                index = mid;
            } else if (target > nums[mid]) {
                first = mid + 1;
                index = mid;
            }
        }
        if (index < 0) return 0;
        if (target > nums[index]) index++;
       // else if (target < nums[index]) index--;
        return index;
    }
}