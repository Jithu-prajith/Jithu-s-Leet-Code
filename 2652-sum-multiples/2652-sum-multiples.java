class Solution {
    public int sumOfMultiples(int n) {
        int i=0;
        int s=0;
        while(i<=n){
            if(i%3==0 || i%5==0 || i%7==0){
                s+=i;
            }
            i++;
        }
        return(s);
    }
}