package Day11.classwork;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static Map<String, Integer> wordFrequency(String text) {
        Map<String, Integer> freq = new LinkedHashMap<>();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i <= text.length(); i++) {
            char c;
            boolean isLetterOrDigit;

            if (i < text.length()) {
                c = Character.toLowerCase(text.charAt(i));
                isLetterOrDigit = Character.isLetterOrDigit(c);
            } else {
                c = ' ';
                isLetterOrDigit = false;
            }

            if (isLetterOrDigit) {
                currentWord.append(c);
            } else {
                if (currentWord.length() > 0) {
                    String word = currentWord.toString();
                    freq.put(word, freq.getOrDefault(word, 0) + 1);
                    currentWord.setLength(0);
                }
            }
        }

        return freq;
    }

    public static void main(String[] args) {
        String s = "ShivamMishra";
        System.out.println(wordFrequency(s));
    }
}
