public class Zad22V2 {
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
                int characterIndex = currentCharacter - (char) ('A');
                int characterShifted = (characterIndex + key) % 26 + (char) ('A');
                encrypted += ((char) (characterShifted));
            } else {
                encrypted += currentCharacter;
            }
        }
        return encrypted;
    }
}