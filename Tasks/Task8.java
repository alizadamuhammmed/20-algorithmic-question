import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cem = 0;
        System.out.println("10 eded daxil edin. ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". ededi daxil edin");
            int eded = scanner.nextInt();
            if (eded % 5 == 0) {
                cem += eded;
            }
        }
        System.out.println("Daxil etdiyiniz ededlerden 5e bolunen ededlerin cemi: " + cem);
    }
}
