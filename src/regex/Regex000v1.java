package regex;

import regex.RegexTester;

public class Regex000v1 {

    public static void main(String[] args) {
        RegexTester tester = new RegexTester("pq*");
        tester.validate("p");
        tester.validate("pq");
        tester.validate("pqqqq");
        tester.validate("pqqqqrrrrr");
        tester.validate("qqqqq");
        tester.validate("asdfsadf");
    }

}