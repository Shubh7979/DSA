class Solution {
    public boolean isPalindrome(String s) {
        // if(s.isEmpty()){
        //     return true;
        // }
        String input = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int right = input.length() - 1;
        int left = 0;

        //couldve used !Character.isLetterOrDigit(s.charAt(char ch)) directly for O(1)

        while(left<right){
            if(input.charAt(left)!=input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}