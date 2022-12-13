package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex001 {
    private static final Pattern pattern = Pattern.compile("p.*q");

    public static void main(String[] args) {
        validate("p");
        validate("pq");
        validate("pqqqq");
        validate("prrrrrrrrrrq");
        validate("ppppppppprr999965454sdafsagrtheadn fgnssaczxvzgewrrrrrrrrrqqqqqqqqqq");
        validate("pqqqqrrrrr");
        validate("qqqqq");
        validate("asdfsadf");
    }

    private static void validate(String text) {
        Matcher matcher = pattern.matcher(text);
        if (matcher.matches()) {
            System.out.println("Prawda dla tekstu: " + text);
        } else {
            System.out.println("Fałsz dla tekstu: " + text);
        }
    }
}
