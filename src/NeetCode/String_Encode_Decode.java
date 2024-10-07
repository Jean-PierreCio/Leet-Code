class Solution {

    public String encode(List<String> strs) {
        String s = "";
        for (int i = 0; i < strs.size(); i++) {
            s += strs.get(i).length();
            s += '%';
            s += strs.get(i);
        }
        System.out.println(s);
        return s;
    }

    public List<String> decode(String str) {
        List<String> strsA = new ArrayList<>();
        List<Integer> alVal = new ArrayList<>();
        int val = 0;
        char c = ' ';
        int i = 0;
        boolean deli = false;
        while (i < str.length()) {
            alVal = new ArrayList<>();
            while(!deli) {
                c = str.charAt(i);
                System.out.println("CHAR: "+ c);
                if (c == '%') {
                    //deli = true;
                    i++;
                    break;
                }
                alVal.add(((int)c)-48);
                i++;
            }
            // add to string
            int size = alVal.size();
            System.out.println("SIZE: "+ size);
            val = (int) Math.pow(10,(size-1))*alVal.get(0);
            System.out.println("VAL1: "+val);
            if (size > 1) {
                val += (int) Math.pow(10,(size-2))*alVal.get(1);
                System.out.println("VAL2: "+val);
            }
            if (size > 2) {
                val += (int) Math.pow(10,(size-3))*alVal.get(2);
                System.out.println("VAL3: "+val);
            }
            System.out.println("VAL: "+val);
            String s = "";
            
            for (int j = 0; j < val; j++) {
                
                c = str.charAt(i+j);
                s += c;
            }
            i += val;
            // add string
            System.out.println("STRING ADDED: "+ s);
            strsA.add(s);
            
        }
        return strsA;

     
    }
}
