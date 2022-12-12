import java.util.Scanner;

public class Zad19v3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj szerokosc fali: ");
        int width = scanner.nextInt();
        System.out.println("Podaj wysokosc fali");
        int height = scanner.nextInt();
        drawWave(width, height);
    }


    private static void drawWave (int width , int height) {
        for (int i = 0; i<height; i++){
            for (int j=0; j<=(height*2 -1)*width; j++){
                if (j%(height*2-1) ==i || j%(height*2-1)==((height*2-1)-i)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}