package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample3 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(.*\\-\\-)(\\w+)(\\-\\-.*)");
        Matcher matcher = pattern.matcher("Francis Junior --Underwood-- został prezydentem USA");
        //System.out.println(matcher.matches()); - musi być inaczej by się wywalil na tych poniższych linijkach z grupami
        System.out.println(matcher.matches());
        System.out.println(matcher.group(0));
        System.out.println(matcher.group(1));
        System.out.println(matcher.group(2));
        System.out.println(matcher.group(3));
    }
}
