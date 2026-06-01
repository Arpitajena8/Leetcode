class Solution {
    public int findMin(int[] nums) {
        int l=0,h=nums.length-1;

        int a=Integer.MAX_VALUE;
        while(l<=h){
            int m=(l+h)/2; 

            if(nums[l]<=nums[m]){
                a=Math.min(a,nums[l]);
                l=m+1;

            }
            else{
                
                a=Math.min(a,nums[m]);
                h=m-1;
            }
        }
        return a;

    }
}