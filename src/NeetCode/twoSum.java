class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j= i+1; j < nums.length; j++) {
                if (nums[i]+ nums[j] == target) {
                    sol[0] = i;
                    sol[1] = j;
                    return sol;
                }
            }
        }
        return sol;
    }
}


// hash map
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> vals = new HashMap<>();
        int[] sol = new int[2];
        for (int i = 0; i < nums.length; i++) {
            //vals.put(nums[i], i);
            System.out.print(nums[i]);
            if (vals.get(target-nums[i]) != null ){
                System.out.println(" | "+i);
                sol[0] = i;
                sol[1] = vals.get(target-nums[i]);
                return sol;
            }
            vals.put(nums[i], i);
        }
        return sol;
    }
}