class Solution {
    public boolean hasDuplicate(int[] nums) {

        // Set<Integer> uniqueNumbers = new HashSet<>();

        // for(int n : nums) {
           
        //    if(uniqueNumbers.contains(n)) {
        //     return true;
        //    } else {
        //     uniqueNumbers.add(n);
        //    }
            
        // }


        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] == nums[j]) {
                    return true;
                } 
            }
        }

        return false;

    };
}