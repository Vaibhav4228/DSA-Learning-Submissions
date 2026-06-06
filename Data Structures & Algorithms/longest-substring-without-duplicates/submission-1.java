class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int[] freq = new int[128];
        int left = 0, right = 0;
        int maxLen = 0;

        while(right < n){
            // if(s.charAt(right) < 128){
                freq[  s.charAt(right)]++;
                while(freq[  s.charAt(right)] > 1){
                    freq[s.charAt(left)]--;
                    left++;
                }
            // }
            maxLen = Math.max(maxLen, right - left + 1);

            right++;

        }
        return maxLen;
        
    }
}
