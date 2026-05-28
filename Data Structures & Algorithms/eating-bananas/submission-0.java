class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for(int p : piles){
            high = Math.max(high, p);
        }

        int ans = high;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(canEating(piles, mid, h)){
                ans = mid;
                // we need to see smaller ans 
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return ans;
        
    }

    private static boolean canEating(int[] piles, int mid, int h){
        int time = 0;
        for(int i = 0; i < piles.length; i++){
            time += (piles[i] + mid -1)/ mid;
        }

        return time <= h;
    }
}
