class Solution {
    public int[] runningSum(int[] nums) {
        int end =1;
        int sum=nums[0];
        for(int i=0;i<nums.length;i++){
            if(end<nums.length){
            sum=sum+nums[end];
            nums[i+1]=sum;
            end++;}
        }
        return(nums);
    }
}