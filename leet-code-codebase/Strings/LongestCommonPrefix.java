class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }

	public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        String[] case1 = {"flower", "flow", "flight"};
        System.out.println("Test 1: " + solution.longestCommonPrefix(case1)); 
        String[] case2 = {"dog", "racecar", "car"};
        System.out.println("Test 2: \"" + solution.longestCommonPrefix(case2) + "\"");
        String[] case3 = {"interspecies", "interstellar", "interstate"};
        System.out.println("Test 3: " + solution.longestCommonPrefix(case3)); 
        String[] case4 = {"alone"};
        System.out.println("Test 4: " + solution.longestCommonPrefix(case4));    }
}