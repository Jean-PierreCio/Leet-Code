import static java.util.Collections.reverseOrder;
import static java.util.Comparator.comparing;
import java.util.ArrayList;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] output = new int[k];
        int prev = 0;
        if (k == 0) {
            return null;
        }
        // storing HashMap
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                prev = map.get(nums[i]);
                map.put(nums[i], ++prev);
            }
            else {
                map.put(nums[i], 0);
            }
        }
        // adding the frequency arraylist of pairs
        List<Pair<Integer, Integer>> freq = new ArrayList<>();
        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            freq.add(new Pair<Integer, Integer>(set.getKey(), set.getValue()));
        }
 
        Comparator<Pair<Integer, Integer>> c = reverseOrder(comparing(Pair::getValue));
        Collections.sort(freq, c);
        for (int i = 0; i < k; i++) {
            output[i] = freq.get(i).getKey();
        }
        return output;
    }
}