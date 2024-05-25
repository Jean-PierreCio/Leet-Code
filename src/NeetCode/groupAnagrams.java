class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        boolean[] dup = new boolean[strs.length];
        List<List<String>> output = new ArrayList<>();
        List<String> test =  new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            if (dup[i]) {
                System.out.println("CONTINUED");
                continue;
            }
            for (int j = i+1; j < strs.length; j++) {
                if(!dup[j] && isAna(strs[i],strs[j])) {
                    if (!dup[i]) {
                        test.add(strs[i]);
                        dup[i] = true;
                    }
                    test.add(strs[j]);
                    dup[j] = true;
                }
            }
            if (test.isEmpty()) {
                test.add(strs[i]);
                dup[i] = true;
            }
            output.add(test);
            test = new ArrayList<>();
        }
        return output;
    }
    boolean isAna(String s, String t) {
         if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }
}