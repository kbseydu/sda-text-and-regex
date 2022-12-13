package regex;

/*
Napisz Regex,
który sprawdza polskie numery telefonów komórkowych,
zaczynające się cyfrą 5.

Numer telefonu jest podany ciągiem, tzn. 515123432
 */
public class Regex003 {
    public static void main(String[] args) {
        RegexTester tester = new RegexTester("(\\+48)?5[0-9]{8}");
        //"\\+?4?8?5[0-9]{8}"
        //to źle bo np
        //+851513123
        //true
        tester.validate("+48515332123");
        tester.validate("515336293");
        //false
        tester.validate("51123");
        tester.validate("615332123");
        tester.validate("715332123");
        tester.validate("+48715332123");
        tester.validate("712123");
    }
}