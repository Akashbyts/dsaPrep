class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int ptr = 0;
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                temp[ptr] = nums[i];
                ptr++;
            }
        }
        for(int i=ptr;i<n;i++){
            temp[i] = 0;
        }
        
         for(int i=0;i<n;i++){
            nums[i] = temp[i];
         }
    }
}
