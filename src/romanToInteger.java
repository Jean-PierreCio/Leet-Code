import java.util.ArrayList;
import java.util.List;

public class romanToInteger {

    public static int romanToInt(String s) {
        String[] dous = { "IV", "IX", "XL", "XC", "CD", "CM" };
        ArrayList<Integer> val = new ArrayList<>();

        if (s.length() < 2) {
            if (s.equals("I")) {
                return 1;
            }
            if (s.equals("V")) {
                return 5;
            }
            if (s.equals("X")) {
                return 10;
            }
            if (s.equals("L")) {
                return 50;
            }
            if (s.equals("C")) {
                return 100;
            }
            if (s.equals("D")) {
                return 500;
            }
            if (s.equals("M")) {
                return 1000;
            }

        }
        boolean dd = false;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1) {
                System.out.println(s.substring(0,2));
                if (s.substring(i, i + 2).equals(dous[0])) {
                    val.add(4);
                    //i++;
                    dd = true;
                }
                if (s.substring(i, i + 2).equals(dous[1])) {
                    val.add(9);
                    //i++;
                    dd = true;
                }
                if (s.substring(i, i + 2).equals(dous[2])) {
                    val.add(40);
                    //i++;
                    dd = true;
                }
                if (s.substring(i, i + 2).equals(dous[3])) {
                    val.add(90);
                    //i++;
                    dd = true;
                }
                if (s.substring(i, i + 2).equals(dous[4])) {
                    val.add(400);
                    //i++;
                    dd = true;
                }
                if (s.substring(i, i + 2).equals(dous[5])) {
                    val.add(900);
                    //i++;
                    dd = true;
                }
            }
            if (dd == true) {
                i++;
            }
            if (dd == false) {
                System.out.println("no duo");
                if (s.substring(i, i + 1).equals("I")) {
                    val.add(1);
                }
                if (s.substring(i, i + 1).equals("V")) {
                    val.add(5);
                }
                if (s.substring(i, i + 1).equals("X")) {
                    val.add(10);
                }
                if (s.substring(i, i + 1).equals("L")) {
                    val.add(50);
                }
                if (s.substring(i, i + 1).equals("C")) {
                    val.add(100);
                }
                if (s.substring(i, i + 1).equals("D")) {
                    val.add(500);
                }
                if (s.substring(i, i + 1).equals("M")) {
                    val.add(1000);
                }
            }
            dd = false;
        }

        // String check = s.substring(0,3);
        // System.out.println(dous[2]);
        int total = 0;
        for (int i = 0; i < val.size(); i++) {
            total += val.get(i);
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
       
    }
}