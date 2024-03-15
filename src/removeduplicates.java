class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int ind = 0;
        HashMap<Integer, Integer> vals = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if (vals.get(nums[i]) == null) {
                k++;
                nums[ind] = nums[i];
                ind++;
            }
            vals.put(nums[i], i);
            
        }
        return k;
    }
}