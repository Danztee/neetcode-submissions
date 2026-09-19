class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> box = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            // System.out.println(strs[i]);

            char[] stringArr =  strs[i].toCharArray();
            Arrays.sort(stringArr);
            String sortedS = new String(stringArr);

            // System.out.println(sortedS);

            box.putIfAbsent(sortedS, new ArrayList<>());

            box.get(sortedS).add(strs[i]);

            // System.out.println(box);
            // System.out.println(box.get(sortedS));

        
            // System.out.println(box.get("sortedS" + sortedS));

            // return new ArraList<>();

        }

        // System.out.println(box.keySet());
        // System.out.println(box.values());


        return new ArrayList<>(box.values());
    }
}
