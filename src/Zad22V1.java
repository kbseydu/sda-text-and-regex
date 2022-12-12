public class Zad22V1 {
    public static void main(String[] args) {
        String encryptedTxt = encrypt("MEznY BaDZ, CHRON PULK TWOJ I SZESC FLAG@@##123", 2);

        System.out.println(encryptedTxt);
    }

    private static String encrypt(String text, int key) {
        text = text.toUpperCase();
        String encrypted = "";

        for (int i = 0; i < text.length(); i++) {
            char currentCharacter = text.charAt(i);

            if (Character.isUpperCase(currentCharacter)) {

                //przeliczamy znak na liczbe z zakresu 0-25   (-65)
                int characterIndex = currentCharacter - (char) 'A';
                int characterShifted = characterIndex + key;

                if (characterShifted > 25) {
                    // korekcja powrotu do zakresu 0 - 25
                    characterShifted = characterShifted - 26;
                }
                // to inaczej mozna zapisac characterShifted= characterShifted % 26;

                //wracamy do ASCII
                characterShifted = characterShifted + (char) 'A';

                encrypted += (char) characterShifted;
            } else {
                //czyli w przypadku jak to nie była litera
                encrypted += currentCharacter;
            }
        }

        return encrypted;
    }
}