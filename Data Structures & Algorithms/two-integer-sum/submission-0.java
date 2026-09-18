class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> seen = new HashMap<>();

        // if(comp)


    // for(n : nums) {
    //     if(comp.get() + nums[n] = target) {

    //     } else {

    //         comp.put(n)

    //     }
    // }

    
    for(int i = 0; i<nums.length; i++) {

        int comp = target - nums[i];

        System.out.println("comp = " + comp);

        if(seen.containsKey(comp)) {
            System.out.println("comp & targer = " + comp + target);

            int compIndex = seen.get(comp);

            return new int[] {compIndex, i};

        } else {
            seen.put(nums[i], i);
        }

    }

    System.out.println("seen = " + seen);

    return new int[0];
    
    };
}
