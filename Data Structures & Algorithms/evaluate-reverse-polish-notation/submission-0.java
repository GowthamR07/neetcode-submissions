class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < tokens.length; i++) {

            String ch = tokens[i];

            if(!ch.equals("+") &&
               !ch.equals("-") &&
               !ch.equals("*") &&
               !ch.equals("/")) {

                st.push(Integer.parseInt(ch));
            }

            else if(ch.equals("+")) {

                st.push(st.pop() + st.pop());
            }

            else if(ch.equals("-")) {

                int op2 = st.pop();
                int op1 = st.pop();

                st.push(op1 - op2);
            }

            else if(ch.equals("*")) {

                st.push(st.pop() * st.pop());
            }

            else if(ch.equals("/")) {

                int op2 = st.pop();
                int op1 = st.pop();

                st.push(op1 / op2);
            }
        }

        return st.peek();
    }
}