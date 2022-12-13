package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Napisz program, który pobiera od użytkownika tekst i sprawdza, czy w podanym tekście wystąpiła data
w formacie YYYY-MM-DD.
Jeśli tak to wypisz tę datę, jeśli nie to wypisz że w tekście nie ma daty
 */
public class Regex006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        Pattern datePattern = Pattern.compile(".*(\\d{4}-\\d{2}-\\d{2}).*");
        Matcher matcher = datePattern.matcher(userInput);
        if(matcher.matches()){
            System.out.println("Data w tekście to: "+matcher.group(1));
        } else {
            System.out.println("Daty nie ma w tekście");
        }

    }
}
