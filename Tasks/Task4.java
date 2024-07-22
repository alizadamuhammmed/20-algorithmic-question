import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("KSQ balinizi daxil edin: ");
        int ksqBal = scanner.nextInt();
        System.out.print("BSQ balinizi daxil edin: ");
        int bsqBal = scanner.nextInt();
        System.out.print("Serbest is balinizi daxil edin: ");
        int serbestIsBal = scanner.nextInt();
        int umumiBal = (int) (ksqBal * 0.35 + bsqBal * 0.5 + serbestIsBal * 0.15);
        char balHerf;
        if (umumiBal <= 100 & umumiBal > 90) {
            balHerf = 'A';
        } else if (umumiBal <= 90 & umumiBal > 80) {
            balHerf = 'B';
        } else if (umumiBal <= 80 & umumiBal > 70) {
            balHerf = 'C';
        } else if (umumiBal <= 70 & umumiBal > 60) {
            balHerf = 'D';
        } else if (umumiBal <= 60 & umumiBal > 50) {
            balHerf = 'E';
        } else {
            balHerf = 'F';
        }
        System.out.printf("Sizin ümumi baliniz: %d (%c)", umumiBal, balHerf);
    }
}
