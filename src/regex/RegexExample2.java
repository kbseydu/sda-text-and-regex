package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("skręć w (prawo|lewo)");
        Matcher matcher = pattern.matcher("skręć w prawo");
        Matcher matcher2 = pattern.matcher("skręć w lewo");
        Matcher matcher3 = pattern.matcher("skręć w góre");

        System.out.println(matcher.matches());
        System.out.println(matcher2.matches());
        System.out.println(matcher3.matches());

        Pattern pattern2 = Pattern.compile("skręć w prawo|lewo");
        Matcher m = pattern2.matcher("skręć w prawo");
        Matcher m2 = pattern2.matcher("lewo");

        System.out.println(m.matches());
        System.out.println(m2.matches());

        Pattern p3= Pattern.compile("java|python|js");
        Matcher m3 = p3.matcher("python");

        System.out.println(m3.matches());
    }
}
