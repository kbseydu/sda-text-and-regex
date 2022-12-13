package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Napisz Regex,
który dopasowuje ciąg znaków, w którym po 'p' występuje
zero lub więcej 'q'.

p
pq
pqqqqqqq

 */
public class Regex000 {
    private static final Pattern pattern = Pattern.compile("pq*");

    RegexTester tester = new RegexTester("pq*");

    public static void main(String[] args) {
        validate("p");
        validate("pq");
        validate("pqqqq");
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