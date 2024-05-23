class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.get(nums[i]) != null) {
                return true;
            }
            hash.put(nums[i], i);
        }
        return false;
    }
}