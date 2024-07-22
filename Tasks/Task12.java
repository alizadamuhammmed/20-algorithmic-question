import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sirketin hal hazirki deyeri: ");
        double indikiDeyer = sc.nextDouble();
        int il = 0;
        while (indikiDeyer<100000){
            indikiDeyer *= 1.21;
            il++;
        }
        System.out.println(il + " il sonra sirketiniz deyeri 100 min manati kececek.");
    }
}
