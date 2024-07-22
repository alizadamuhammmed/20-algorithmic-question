import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        int cem = 0;
        System.out.println("Toplamaq ucun eded daxil edin, sonlandirmaq ucun stop yazin.");
        while (a) {
            String input = scanner.next();
            if (input.toLowerCase().equals("stop")) {
                System.out.println(cem);
                break;
            } else {
                cem += Integer.parseInt(input);
            }
        }
    }
}
