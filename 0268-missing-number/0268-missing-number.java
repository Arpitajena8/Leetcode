class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;
        int res=n*(n+1)/2;
        int asum=0;
        for(int num:nums){
            asum += num;
        }
        return res-asum;
    }
}