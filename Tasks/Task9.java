import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cem = 0;
        int say = 0;
        while (cem < 110){
            System.out.print("Bir eded daxil edin: ");
            int eded = sc.nextInt();
            cem += eded;
            say++;
        }
        System.out.printf("Daxil etdiyiniz ededlerin cemi 110-u kecmisdir (%d)",cem);
    }
}
