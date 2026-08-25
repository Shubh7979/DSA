class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int smallestMiss = 0;

    for(int i = 0; i <= nums.length; i++){
        int n = k*(i+1);
        boolean contains = IntStream.of(nums).anyMatch(x -> x == n);
        if (contains == false){
            smallestMiss = n;
             break;

        }

    }
        return smallestMiss;
    }
}