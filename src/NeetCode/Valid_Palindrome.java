class Solution {
    public boolean isPalindrome(String s) {
        String Ns = "";
        char val; 
        for (int i = 0; i < s.length(); i++) {
            val =  s.charAt(i);
            val = Character.toLowerCase(val);
            int asci = (int) val;
            if ((asci >= 97 && asci <= 122) || (asci >=48 && asci <=57)) {
                Ns += val;
            }

        }
        int j = Ns.length() -1;
        
        for(int i = 0; i < (Ns.length() / 2); i ++) {
            if (Ns.charAt(i) != Ns.charAt(j)) {
                return false;
            }
            j--;
        }

        System.out.println(Ns);
        return true;
    }
}