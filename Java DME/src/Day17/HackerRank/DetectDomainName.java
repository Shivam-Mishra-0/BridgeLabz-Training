package Day17.HackerRank;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class DetectDomainName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        StringBuilder allText = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (sc.hasNextLine()) {
                allText.append(sc.nextLine()).append("\n");
            }
        }

        String regex = "https?://(?:www\\.|ww2\\.)?([a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)+)(?=[/\"'?)\\s]|$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(allText.toString());

        TreeSet<String> domains = new TreeSet<>();
        while (matcher.find()) {
            domains.add(matcher.group(1));
        }

        System.out.println(String.join(";", domains));

    }
}
