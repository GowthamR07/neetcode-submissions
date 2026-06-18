class Solution {
    public int characterReplacement(String s, int k) {
        char[] arr = s.toCharArray();
        int left=0;
        int right=0;
        Map<Character,Integer> hm = new HashMap<>();
        int n = arr.length;
        int maxLen=0;
        int mostFreq=0;
        while(right<n){
            //expand the window
            hm.put(arr[right],hm.getOrDefault(arr[right],0)+1);
            mostFreq=Math.max(mostFreq,hm.get(arr[right]));
            //shrink the window
            if((right-left+1)-mostFreq>k){
                hm.put(arr[left],hm.get(arr[left])-1);
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}
