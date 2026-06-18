class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> nums1Index=new HashMap<>();
        int[]res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            nums1Index.put(nums1[i],i);
        }
        for(int i=0;i<res.length;i++){
            res[i]=-1;
        }
        Stack<Integer>st=new Stack<>();
        for(int num:nums2){
            while(!st.isEmpty()&&num>st.peek()){
                int popped=st.pop();
                if(nums1Index.containsKey(popped)){
                    int index=nums1Index.get(popped);
                    res[index]=num;
                }
            }
            if(nums1Index.containsKey(num)){
                st.push(num);
            }
        }
        return res;
    }
}