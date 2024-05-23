class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sA = new int[26];
        int[] tA = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int ind = (int) c;
            sA[ind - 97]++;
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            int ind = (int) c;
            tA[ind - 97]++;
        }

        return Arrays.equals(sA, tA);
    }
}