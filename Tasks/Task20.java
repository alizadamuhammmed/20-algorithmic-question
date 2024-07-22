import java.util.Random;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner scanner = new Scanner(System.in);
        int a = rd.nextInt(1, 20);
        System.out.print("1 ve 20 arasinda bir eded texmin edin: ");
        boolean loop = true;
        int texminSayi = 3;
        while (loop) {
            int texminEded = scanner.nextInt();
            texminSayi--;
            if (texminSayi==0){
                System.out.println("Cavab haqqiniz bitdi. Duzgun eded: "+a);
                break;
            }
            if (texminEded == a) {
                System.out.println("Tebrikler. Duzgun texmin etdiniz!");
                break;
            } else if (texminEded > a) {
                System.out.println("Daha kicik eded texmin edin. Qalan haqqiniz: " + texminSayi);
            } else {
                System.out.println("Daha boyuk eded texmin edin. Qalan haqqiniz: " + texminSayi);
            }

        }

    }
}
