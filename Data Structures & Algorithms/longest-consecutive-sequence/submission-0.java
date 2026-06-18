class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        // max length ever seen
        int max=0;
        for(int n:nums){
            int currlength=0;

            int num = n;
            if(set.contains(n-1)) continue;
            while(set.contains(num)){
                currlength+=1;
                 num++;
            }

         max=Math.max(max,currlength);

        }
        return max;

    }
}
