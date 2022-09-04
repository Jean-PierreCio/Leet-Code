public class romanToInteger {

    public static int romanToInt(String s) {
        String[] dou = {"IV","IX","XL","XC","CD","CM"};
        //List<Integer[]> val = new ArrayList<>();
        if(s.length() < 2) {
            if(s.equals("I")) {
                return 1;
            }
            if(s.equals("V")) {
                return 5;
            }
            if(s.equals("X")) {
                return 10;
            }
            if(s.equals("L")) {
                return 50;
            }
            if(s.equals("C")) {
                return 100;
            }
            if(s.equals("D")) {
                return 500;
            }
            if(s.equals("M")) {
                return 1000;
            }
            
        }
        for(int i = 0; i < s.length()-1; i++) {
            //if(s.substring(0,2).equals(duo[0])) {
              //  val.add(4);
            //}
            
        }
        
        String check = s.substring(0,3);
        //System.out.println(duo[2]);
        
        return 0;
    }
    public static void main(String[] args) {
        romanToInt("ifjla");
    }
}