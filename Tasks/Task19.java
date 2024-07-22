import java.util.Random;
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean starter = true;
        System.out.print("Diqqet! Bextebext oyunumuz baslayir, size ilk cixan eded: ");
        int cem = 0;
        while (starter) {
            int randomNumber = rd.nextInt(1, 15);
            if (randomNumber == 5 || randomNumber == 3 || randomNumber == 7 ) {
                System.out.println("Siz meglub oldunuz.");
                cem = 0;
                break;
            } else {
                System.out.printf("%d %n", randomNumber);
                cem += randomNumber;
                System.out.println("Hal hazirda elinizde " + cem + " manat pul var. Oyunu sonlandirmaq" +
                        " isteyirsinizse stop yazin. Davam etmek ucun davam yazin.");
                String StopOrContinue = scanner.next();
                if (StopOrContinue.equalsIgnoreCase("stop")) {
                    System.out.println("Siz " + cem + " manat qazandiniz.");
                    break;
                }
            }
        }
    }
}
