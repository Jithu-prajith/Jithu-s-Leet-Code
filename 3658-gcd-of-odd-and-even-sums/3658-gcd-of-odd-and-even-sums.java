class Solution {
    public int gcdOfOddEvenSums(int n) {
        int so=0;
        int se=0;
        int max=0;
        int j=1;
        if(n==1){
            return 1;
        }
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                se+=i;
            }
            else{
                so+=i;
            }
        }
        while( j<=se/2 && j<=so/2){
            if(se%j==0 && so%j==0){
                if(max<j){
                max=j;}
            }
            j++;
        }
        return max;

    }
}