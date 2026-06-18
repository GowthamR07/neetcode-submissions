class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int j=1;
            for(int k=0;k<nums.length;k++)
            {
                if (i != k) {
                    j=j*nums[k];
                }
            }

            output[i]=j;       
}
 return output;

    }
    }