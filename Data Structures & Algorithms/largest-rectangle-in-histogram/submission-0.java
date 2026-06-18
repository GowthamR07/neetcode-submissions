class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>st=new Stack<>();
        int MaxArea=0;
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty()&&heights[st.peek()]>heights[i]){
                int height=heights[st.peek()];
                int nse=i;
                st.pop();
                int pse=st.isEmpty()?-1:st.peek();
                MaxArea=Math.max(MaxArea,height*(nse-pse-1));
            }
            st.push(i);
        }
        //leftover elements in the stack and these elements didnt have nse thats why we assigning it has "n"
        while(!st.isEmpty()){
            int height=heights[st.peek()];
            int nse=heights.length;
            st.pop();
            int pse=st.isEmpty()?-1:st.peek();
            MaxArea=Math.max(MaxArea,height*(nse-pse-1));
        }
        return MaxArea;
    }
}
