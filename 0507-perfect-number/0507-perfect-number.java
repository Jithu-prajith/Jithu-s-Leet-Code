class Solution {
    public boolean checkPerfectNumber(int num) {
        int s=0;
        for(int i=num/2;i>0;i--){
            if(num%i==0){
                s+=i;
            }
        }
        if(s==num){
            return true;
        }
        return false;
        
    }
}