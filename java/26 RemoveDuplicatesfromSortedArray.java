#https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution {
public int removeDuplicates(int[] nums) {
    if(nums.length <= 1) return nums.length;
    int countUnique = 1;
    for(int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i - 1]) {
            nums[countUnique] = nums[i];
            countUnique++;
        }
    }
    return countUnique;
}
}