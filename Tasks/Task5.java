import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktorialini tapmag istediyiniz ededi daxil edin: ");
        int eded = scanner.nextInt();
        int faktorial = 1;
        for (int i = 1; i <= eded; i++) {
            faktorial*=i;
        }
        System.out.println(faktorial);
    }
}
