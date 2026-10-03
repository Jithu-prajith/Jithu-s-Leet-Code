class Solution {
    public boolean isValid(String s) {
        Stack <Character> arr=new Stack<>();
        for(char i: s.toCharArray()){
            if(i=='('||i=='{'||i=='['){
                arr.push(i);

            }
            else{
                if(arr.isEmpty()){
                    return false;
                }
                char top=arr.pop();
                if((top=='('&& i!=')')||(top=='{'&&i!='}')||(top=='['&& i!=']')){
                    return false;
                }
               
            }
        } return arr.isEmpty();
    }
}