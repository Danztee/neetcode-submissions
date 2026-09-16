class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        // // Map<String, Integer> items  = new HashMap();

        // // System.out.println("items = " + items);


        // char[] charsA = s.toCharArray();
        // Arrays.sort(charsA);

        // String sortedA = new String(charsA);

        // // 

        // char[] charsB = t.toCharArray();
        // Arrays.sort(charsB);

        // String sortedB = new String(charsB);

        // // System.out.println("sorted chars = " + sortedA + " " + sortedB);

        // if(sortedA.equals(sortedB)) {
        //     System.out.println(sortedA + "--" + sortedB);
        //     return true;
        // }

        Map<Character, Integer> itemsA  = new HashMap();
        Map<Character, Integer> itemsB  = new HashMap();

        for(int i = 0; i< s.length(); i++) {
            // System.out.println("[i] = " + s.charAt(i));
            // itemsA.put(s.charAt(i), 1);

            if(itemsA.containsKey(s.charAt(i))) {
               itemsA.put(s.charAt(i), itemsA.get(s.charAt(i)) + 1); 
            } else {
                itemsA.put(s.charAt(i), 1);
            }
        }

        for(int i = 0; i < t.length(); i++) {
            // System.out.println("[i] = " + s.charAt(i));
            // itemsA.put(s.charAt(i), 1);

            if(itemsB.containsKey(t.charAt(i))) {
               itemsB.put(t.charAt(i), itemsB.get(t.charAt(i)) + 1); 
            } else {
                itemsB.put(t.charAt(i), 1);
            }
        }

        System.out.println("items A = " + itemsA);
        System.out.println("items B = " + itemsB);

        if(itemsA.equals(itemsB)) {
            return true;
        }

        return false;
    };
}
