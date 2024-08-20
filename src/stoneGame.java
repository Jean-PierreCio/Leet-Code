class Solution {
    public boolean stoneGame(int[] piles) {
        int AMax = 0;
        int BMax = 0;

        for (int i = 0; i < piles.length-1; i+=2) {
            AMax += piles[i];
            BMax += piles[i+1];
        }
        if(AMax > BMax) {
            return true;
        }
        else{
            AMax = 0;
            BMax = 0;
            for (int i = 0; i < piles.length-1; i+=2) {
                BMax += piles[i];
                AMax += piles[i+1];
            }
            if (AMax > BMax){
                return true;
            }
            return false;
        }
        
    }
}