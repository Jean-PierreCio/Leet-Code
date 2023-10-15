class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() %2 != 0 ) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}' )) {
                return false;
            }
            else if ((s.charAt(i) == ')')&& (stack.peek() == '(')) {
                stack.pop();
            }
            else if (  (s.charAt(i) == ']') && (stack.peek() == '[')) {
                stack.pop();
            }
            else if ( (s.charAt(i) == '}') && (stack.peek() == '{')) {
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }


        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;


        /*
        int openP = 0;
        int openB = 0;
        int openC = 0;
        //int closeP = 0;
        //int closeB = 0;
        //int closeC = 0;

        char[] in = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openP++;
            }
            else if (s.charAt(i) == '[') {
                openB++;
            }
            else if (s.charAt(i) == '{') {
                openC++;
            }
            else if (s.charAt(i) == ')') {
                openP--;
            }
            else if (s.charAt(i) == ']') {
                openB--;
            }
            else if (s.charAt(i) == '}') {
                openC--;
            }
        }

        if ((openP == 0) && (openB == 0) && (openC == 0)) {
            return true;
        }
        return false;
        */
    }
}