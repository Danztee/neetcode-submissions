class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> uniqueNumbers = new HashSet<>();

        for(int n : nums) {
           
           if(uniqueNumbers.contains(n)) {
            return true;
           } else {
            uniqueNumbers.add(n);
           }
            
        }

        return false;
    };
}