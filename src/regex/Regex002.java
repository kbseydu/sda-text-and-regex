package regex;

/*
Napisz regex,
który znajdzie tekst, w którym po jednej dużej literze następują małe litery.

OK:
Java
ja

ŹLE:
J
 */

public class Regex002 {
    public static void main(String[] args) {
        RegexTester tester = new RegexTester("[A-Z][a-z]+");
        tester.validate("Java");
        tester.validate("Ja");
        tester.validate("java");
        tester.validate("javA");
        tester.validate("JAVa");
        tester.validate("J");
        tester.validate("aJ");
    }
}
