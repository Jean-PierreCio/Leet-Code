class Solution {
    public int climbStairs(int n) {
        int prev = 2;
        int Pprev = 1;
        int PfP = 0;

        for (int i = 1; i <= n-2; i++) {
            PfP = prev;
            prev = prev + Pprev;
            Pprev = PfP;
            System.out.println("prev: "+ prev);
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return prev;
    }
}