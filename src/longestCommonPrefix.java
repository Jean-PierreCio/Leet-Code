class Solution {
    public String longestCommonPrefix(String[] strs) {
        int end = 0;
        int minLen = 100000000;
        int minStr = 0;
        int cnt = 0;
        for (String str:strs) {
            if (str.length() < minLen) {
                minLen = str.length();
                minStr = cnt;
            }
            cnt++;
        }
        boolean valid = true;
        for (int i = 0; i < minLen; i++) {
            if (valid == false) {
                break;
            }
            char c = strs[0].charAt(end);
            for (String str:strs) {
                if (c != str.charAt(end)) {
                    valid = false;
                    break;
                }
            
            } 
            end++;
        }
        if (valid == false) {
            return strs[0].substring(0,end-1);
        }
        return strs[minStr];

    }
}