package regex;

import java.util.regex.Pattern;

/*
Napisz Regex,
sprawdza czy użytkownik wprowadził poprawną nazwę miejscowosci.

Na przykład Wroclaw, Zielona Gora czy Bielsko-Biala jest ok, jednak Ptysiow123 już nie.
Dla uproszczenia załóżmy, że żadna nazwa miejscowości nie zawiera polskich znaków.
 */
public class Regex004 {
    public static void main(String[] args) {
        RegexTester tester = new RegexTester("[A-ZŻŹĆŃÓŁĘĄŚ][a-zżźćńółęąś]+([ \\-][A-Z][a-zżźćńółęąś]+)?");
        tester.validate("Łódź");
        tester.validate("Wroclaw");
        tester.validate("Wrocław");
        tester.validate("Zielona Gora");
        tester.validate("Bielsko-Biala");
        tester.validate("Bielsko-Biała");
        tester.validate("Ptysiow123");
        tester.validate("warszawa");
    }
}