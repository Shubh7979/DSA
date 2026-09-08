class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int[] sqArr = new int[nums.length];

        for(int i = nums.length-1 ; i >= 0 ; i--){
            int leftsquare = nums[left]*nums[left];
            int rightsquare = nums[right]*nums[right];

            if(leftsquare < rightsquare){
                sqArr[i] = rightsquare;
                right--;
            }else{
                sqArr[i] = leftsquare;
                left++;
            }
        }

        return sqArr;
    }
}