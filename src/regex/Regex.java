package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("test");
        Matcher matcher = pattern.matcher("Tekst w ktorym szukam test");

        //dopasowanie do całego tekstu w kotrym szukamy
        System.out.println(matcher.matches());

        //metoda find -> czy jest pasujacy fragment
        System.out.println(matcher.find());

        //szuka kolejnego dopasowania
        System.out.println(matcher.find());
        // mozna to potem resetowac matcher.reset
    }
}
