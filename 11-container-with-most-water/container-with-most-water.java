class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int water = 0;

        for(int i = 0 ; i < height.length; i++){
            if(height[left] < height[right]){
                int area = (right - left) * Math.min(height[left], height[right]);
                water = Math.max(water,area);
                left++;
            }else{
                int area = (right - left) * Math.min(height[left], height[right]);
                water = Math.max(water,area);
                right--;
            }
        }
        return water;

    }
}