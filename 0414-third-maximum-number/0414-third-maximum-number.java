class Solution {
    public int thirdMax(int[] nums) {
           Arrays.sort(nums);
           int c=1;
           int l=nums[nums.length-1];
           for(int i=nums.length-2;i>=0;i--){
            if(nums[i]!=l){
                c++;
                l=nums[i];
            }
            if(c==3){
                return(nums[i]);
            }
           }
           return(nums[nums.length-1]);
    }
}