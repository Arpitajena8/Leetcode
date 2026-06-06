class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0){
            return 0;
        }
            int min=prices[0];
            int maxp=0;
            for(int i=0;i<prices.length;i++){
                int c=prices[i]-min;
                maxp=Math.max(maxp,c);
                min=Math.min(min,prices[i]);
            }
            return maxp;
        }
    
}