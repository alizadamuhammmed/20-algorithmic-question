import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int birinciEded = 1;
        int ikinciEded = 1;
        int ucuncuEded;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nece fibanocci ededini gormek isteyirsiniz? (Minimum 3)");
        int say = scanner.nextInt();
        System.out.print(birinciEded + " " + ikinciEded + " ");
        for (int i = 0; i < say - 2; i++) { // Ilk iki eded evvelceden verilib
            ucuncuEded = birinciEded + ikinciEded;
            System.out.print(ucuncuEded + " ");
            birinciEded = ikinciEded;
            ikinciEded = ucuncuEded;
        }
    }
}
