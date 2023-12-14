package NeetCode;

import java.util.*;

class firstUniqChar {
    public int firstUniqChar(String s) {
        int[] chars = new int[26];
        HashMap<Character, Integer> common = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int pos = (int) c;
            chars[pos - 97]++;
        }
        int min = (10*10*10*10*10) + 1;
        for (int i = 0; i < 26; i++) {
            if(chars[i] == 1){
                char check = (char)(97+i) ;
                if (s.indexOf(check) < min) {
                    min = s.indexOf(check);
                }
            }
        }
        if (min == (10*10*10*10*10) + 1) {
            return -1;
        }
    
        return min;
    }
}