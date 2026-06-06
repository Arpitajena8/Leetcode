class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Boolean>h=new HashMap<>();
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(!h.containsKey(nums[i])){
                h.put(nums[i],true);
                nums[index]=nums[i];
                index++;

            }

        }
        return index;
        
    }
}