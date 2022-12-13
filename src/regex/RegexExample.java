package regex;
/*
Wszystkie predefiniowane klasy prezentuje lista poniżej:

\\d – jakakolwiek cyfra [0-9],
\\D – jakikolwiek znak, który nie jest cyfrą,
\\w – znak używany w słowach [a-zA-Z0-9_] (zauważ, że mamy tu znak _),
\\W – jakikolwiek znak, który nie jest używany w słowach,
\\s – tak zwane białe znaki czyli znak spacji czy tabulacji [ \t\n\r\f\x0B].
Możesz je opisać jako znaki, które nie są widoczne podczas wydruku,
 */
public class RegexExample {
    public static void main(String[] args) {
        String fourDigitsNumbersPattern = "\\d{4}";
        RegexTester tester = new RegexTester(fourDigitsNumbersPattern);
        tester.validate("1984");
        tester.validate("2022");
        tester.validate("202212312");
        tester.validate("202");
        tester.validate("asdfsadf");
        tester.validate("asdf");

        String pattern = "\\d\\w\\d";
        RegexTester tester1 = new RegexTester(pattern);
        tester1.validate("0_0");
        tester1.validate("0X1");
        tester1.validate("x8z");
        tester1.validate("0 0");
    }
}
