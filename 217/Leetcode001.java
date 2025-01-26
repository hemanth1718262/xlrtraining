class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) {
            return false;
        }
        
        int original = x;
        int reversed = 0;
        
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        
        return original == reversed;
    }
    public class Leetcode001{
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));// true 
        System.out.println(solution.isPalindrome(-121));// false
        System.out.println(solution.isPalindrome(10));// false

    }
    }
}
