class Solution {
    public int maxProduct(int[] nums) {
        int product=1,suff=1;
        int a=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(product==0)product=1;
            if(suff==0)suff=1;

            product=product*nums[i];
            suff=suff*nums[n-i-1];
            a=Math.max(a,Math.max(a,Math.max(product,suff)));

        }
        return a;
        
    }
}