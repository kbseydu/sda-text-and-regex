import java.util.Scanner;

public class Zad19v1 {

    private static final String FIRST_ROW_ELEMENT = "*      *";
    private static final String SECOND_ROW_ELEMENT = " *    * ";
    private static final String THIRD_ROW_ELEMENT = "  *  *  ";
    private static final String FOURTH_ROW_ELEMENT = "   **   ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waveLength = scanner.nextInt();
        printRow(waveLength, FIRST_ROW_ELEMENT);
        printRow(waveLength, SECOND_ROW_ELEMENT);
        printRow(waveLength, THIRD_ROW_ELEMENT);
        printRow(waveLength, FOURTH_ROW_ELEMENT);
    }
    private static void printRow(int waveLength, String rowElement){
        for (int i=0; i < waveLength; i++){
            System.out.println(rowElement);
        }
        System.out.println();
    }
}
