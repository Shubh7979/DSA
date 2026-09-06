class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
        sum += nums[i];
        sumLeft[i] = sum;
        }
        sum = 0;
        for(int j = sumRight.length  - 1; j >= 0; j--){
            sum += nums[j];
            sumRight[j] = sum;
        }

        for (int i = 0; i < nums.length; i++) {
            if (sumLeft[i] == sumRight[i]) {
                return i;
            }
        }
        return -1;
    }
}