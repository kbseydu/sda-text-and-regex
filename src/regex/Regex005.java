package regex;

/*
Napisz 2 regexy:
1 - > sprawdza poprawność imienia
2 - > sprawdza poprawność nazwiska (weź pod uwagę nazwiska wieloczłonowe) //bez polskich znakow
np. Bachleda-Curus, von der Leyen, de Silva

 */

public class Regex005 {
    // "(([a-z]+ )*[A-Z][a-z]+)|([A-z][a-z]+(\\-)?)+");
    // RegexTester tester1 = new RegexTester("([A-Z][a-z]+)?(van der Leyen( [A-Z][a-z]+)?)?(de Silva)?([A-Z][a-z]+\\-[A-Z][a-z]+)?");

    public static void main(String[] args) {
        RegexTester firstnameTester = new RegexTester("[A-Z][a-z]+");
        firstnameTester.validate("Urszula");
        firstnameTester.validate("Tomek");
        firstnameTester.validate("Janusz");
        firstnameTester.validate("janusz");

        RegexTester surnameTester = new RegexTester("[a-zA-Z]+([ '\\-][a-zA-Z]+)*");
        surnameTester.validate("Kowalski");
        surnameTester.validate("von der Leyen");
        surnameTester.validate("von der Leyen Aasd");
        surnameTester.validate("von der Leyen-Kowalska");
        surnameTester.validate("Bachleda-Curus");
        surnameTester.validate("de Silva");
    }
}
