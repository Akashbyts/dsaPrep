class Solution {
    public void rotate(int[] nums, int k) {
        for(int i = 0; i < k; i++){
            int shift = nums[nums.length - 1];
            for(int j = nums.length - 1; j >=1; j--){
                nums[j] = nums[j - 1];
            }
            nums[0] = shift;
        }
    }
}