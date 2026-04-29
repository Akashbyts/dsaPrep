class Solution {
    public boolean checkArray(int[] array1, int[] array2){
        if(array1.length != array2.length){
            return false;
        }

        for(int i = 0; i < array1.length; i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }

    public boolean check(int[] nums) {
        int length = nums.length;
        int[] originalArray = nums.clone();

        // sorting the given array

        Arrays.sort(originalArray);
        
        for(int i = 0; i < length; i++){
            int[] rotateArray = new int[length];
            for(int j = 0; j < length; j++){
                rotateArray[j] = originalArray[(j + i) % length];
            }
            // check the array is same or not
            if(checkArray(nums, rotateArray)){
                return true;
            }
        }
        return false;
    }
}