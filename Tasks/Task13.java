import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.println(average(6));
    }
    public static double average(int say){
        Scanner sc = new Scanner(System.in);
        double cem = 0;
        for (int i = 1; i <= say; i++) {
            System.out.print(i + ". sagirdin qiymetini daxil edin: ");
            double qiymet = sc.nextDouble();
            cem += qiymet;
        }
        return cem/say;
    }
}
