class Solution {
    public int singleNumber(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }

        
        for(int i = 0; i < nums.length; i++){
            int freq = 1;
            int num = nums[i];
            for(int j = 0; j < nums.length; j++){
                if(i != j && nums[j] == num){
                    freq++;
                }
            }
            if(freq != 2){
                return num;
            }
        }
      return -1;

    }
}