class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // so we can stick i poiter and move the j and k
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        /*Array ki length me se - 2 isliye kiya kyunki hum 3 elements (i, j, aur k) ka triplet dundh rahe hain.

Agar i bilkul aakhiri element tak chala gaya, toh uske aage j aur k ke liye array me jagah hi nahi bachegi! */
        for(int i = 0; i<nums.length-2; i++){
            // duplicate skip
            if(i>0 && nums[i] == nums[i-1]) continue;

            //2 pointerns 
            int j = i +1, k = nums.length-1;

            while(j < k){
                int currSum = nums[i] + nums[j] + nums[k];

                if(currSum == 0){
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while(j<k && nums[j] ==nums[j+1]) j++;
                    while(j < k && nums[k] == nums[k-1]) k--;

                    j++;
                    k--;
                } 
                else if(currSum < 0) j++;
                else k--;
            }
            

        } 
        return res;
    }
}
