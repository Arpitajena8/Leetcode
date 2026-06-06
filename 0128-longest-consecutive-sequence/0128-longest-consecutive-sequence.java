class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int longest=1;
        if(n==0){
            return 0;
        }
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++){
            h.add(nums[i]);
        }
        for(int x:h){
            if(!h.contains(x-1)){
                int count=1;
                int y=x;
                while(h.contains(y+1)){
                    y=y+1;
                    count +=1;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;


    }
}