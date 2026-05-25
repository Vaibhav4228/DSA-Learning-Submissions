class Solution {
    public int maxArea(int[] heights) {
        int maxii =0 ;
        int left = 0;
        int right = heights.length - 1;

        while(left <= right){
            int width = right - left;
            int currHeight = Math.min(heights[left], heights[right]);

            int currWater = width * currHeight;

            maxii = Math.max(maxii, currWater);

            if(heights[left] < heights[right]){
                left ++;
            }
            else right --;

        }
        return maxii;
        
    }
}
