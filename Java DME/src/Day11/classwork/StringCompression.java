package Day11.classwork;

public class StringCompression {
    public static String compress(String s) {
        if (s.isEmpty()) {
            return s;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        return compressed.length() < s.length() ? compressed.toString() : s;
    }

    public static void main(String[] args) {
        String s = "Shivam";
        System.out.println(compress(s));
    }
}
