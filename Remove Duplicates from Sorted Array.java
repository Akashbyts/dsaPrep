class Solution {
    public int removeDuplicates(int[] nums) {
        int[] expectedNums = new int[nums.length];

        expectedNums[0] = nums[0];
        int idx = 1;
        for(int i  = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                expectedNums[idx] = nums[i];
                idx++;
            }
        }

        for(int i = 0; i < idx;i++){
            nums[i] = expectedNums[i];
        }
        return idx;
    }
}