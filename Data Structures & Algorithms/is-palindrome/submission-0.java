class Solution {
    public boolean isPalindrome(String s) {
            s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            StringBuilder original = new StringBuilder(s);
            StringBuilder reversed = new StringBuilder(s);
            reversed.reverse();
            String reversedString = reversed.toString();
            if(original.toString().equals(reversedString)){
                return true;
            }
            else{
                return false ;
            }
        
        
    }
}
