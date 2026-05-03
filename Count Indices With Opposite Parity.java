
class Solution {
    public int[] countOppositeParity(int[] nums) {
        int[] answer = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int count = 0;
            int number = nums[i];
            int odd_even = (number % 2 == 0)?1:0; // 1 of even and 0 if odd

            
            for(int j = i+1; j < nums.length; j++){
                if(odd_even == 1){
                    if(nums[j] % 2 != 0){
                        count++;
                    }
                }else{
                    if(nums[j] % 2 == 0){
                        count++;
                    }
                }
            }

            answer[i] = count;
        }
        return answer;
    }
}