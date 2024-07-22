import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int netice = 0;
        System.out.print("Hansi emeli etmek isteyirsiniz? (* / + -): ");
        String emel = sc.next();
        System.out.print("Birinci ededi daxil edin: ");
        int eded1 = sc.nextInt();
        System.out.print("Ikinci ededi daxil edin: ");
        int eded2 = sc.nextInt();
        netice = switch (emel) {
            case "*" -> eded1 * eded2;
            case "/" -> eded1 / eded2;
            case "+" -> eded1 + eded2;
            case "-" -> eded1 - eded2;
            default -> netice;
        };
        System.out.printf("%d %s %d = %d", eded1, emel, eded2, netice);
    }
}
