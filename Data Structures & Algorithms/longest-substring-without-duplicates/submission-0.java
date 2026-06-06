class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int[] freq = new int[128];
        int left = 0, right = 0;
        int maxLen = 0;

        while(right < n){
            char rightChar = s.charAt(right);

            if(rightChar < 128){
                freq[rightChar]++;

                while(freq[rightChar] > 1){
                    char leftChar = s.charAt(left);
                    freq[leftChar]--;
                    left++;
                }
            }
            maxLen = Math.max(maxLen, right - left + 1);

            right++;

        }
        return maxLen;
        
    }
}
