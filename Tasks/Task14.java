import java.util.Arrays;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci ededi daxil edin: ");
        int birinciEded = sc.nextInt();
        System.out.print("Ikinci ededi daxil edin: ");
        int ikinciEded = sc.nextInt();
        System.out.print("Ucuncu ededi daxil edin: ");
        int ucuncuEded = sc.nextInt();
        int[] edeler = {birinciEded, ikinciEded, ucuncuEded};
        Arrays.sort(edeler);
        for (int i : edeler) {
            System.out.print(i + " ");
        }
    }
}
