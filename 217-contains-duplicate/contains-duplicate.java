class Solution {
    public boolean containsDuplicate(int[] nums) {
        // boolean x = false;

        // for(int i = 0; i< nums.length; i++){
        //     for(int j = i+1; j< nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             x = true;
        //         }
        //     }
        // }
        HashMap<Integer,Integer> freq = new HashMap<>();

        // for(int n : nums){
        //     freq.put(n, freq.getOrDefault(nums, 0) + 1);
        // }
        // if(freq.containsValue(2)){
        //     x = true;
        // }

        for(int n : nums){
            if(freq.containsKey(n)){
                return true;
            }
            freq.put(n,1);
        }
        
        return false;
        // return x;
    }
}