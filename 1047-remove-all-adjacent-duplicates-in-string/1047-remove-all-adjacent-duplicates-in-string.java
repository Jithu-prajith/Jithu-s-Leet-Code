class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>stack=new Stack<>();
        for(char i:s.toCharArray()){
            //stack.push(i);

            if(!stack.isEmpty()&&stack.peek()==i){
                stack.pop();

            }
            else{
                stack.push(i);
            }
        }
       String str="";
       for(char i:stack){
        str+=i;
       }
       return str;
    }
}