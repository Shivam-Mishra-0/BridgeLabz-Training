class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;

        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }

        return end - start;        
    }
	public static void main(String[] args) {
        LengthOfLastWord solver = new LengthOfLastWord();

        String test1 = "Hello World";
        String test2 = "   fly me   to   the moon  ";
        String test3 = "luffy is still joyboy";
        String test4 = "a";
        String test5 = "    "; 
        System.out.println("String: \"" + test1 + "\" -> Length: " + solver.lengthOfLastWord(test1));
        System.out.println("String: \"" + test2 + "\" -> Length: " + solver.lengthOfLastWord(test2));
        System.out.println("String: \"" + test3 + "\" -> Length: " + solver.lengthOfLastWord(test3));
        System.out.println("String: \"" + test4 + "\" -> Length: " + solver.lengthOfLastWord(test4));
        System.out.println("String: \"" + test5 + "\" -> Length: " + solver.lengthOfLastWord(test5));
    }
}