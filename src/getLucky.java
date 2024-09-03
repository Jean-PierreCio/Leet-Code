class Solution {
    public int getLucky(String s, int k) {
        int val=0;
        for(int j = 0; j < k; j++) {
            int[] sInt = new int[s.length()];
            val = 0;
            int sac = 0;
            if (j > 0 ) {
                for (int i = 0; i < sInt.length; i++) {
                    sInt[i] = s.charAt(i) - '0';
                    val += s.charAt(i) - '0';
                }
            }
            else {
                for (int i = 0; i < sInt.length; i++) {
                    //sInt[i] = ((int) s.charAt(i)-96);
                    sac = ((int) s.charAt(i)-96);
                    if (sac >9) {
                        val += ((int) s.charAt(i)-96)/10;
                        val += ((int) s.charAt(i)-96)%10;
                    }
                    else {
                        val += ((int) s.charAt(i)-96);
                    }
                    System.out.println("val: "+val);
                }
            }
            
            s = Integer.toString(val);
            System.out.println(s);
        }
        return val;
    }
}