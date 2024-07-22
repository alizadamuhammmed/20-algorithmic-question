import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Standart saatliq maas nece manatdir? ");
        double saatliqMaas = sc.nextDouble();
        System.out.print("Isinciniz bu hefte nece saat isleyib? ");
        int vaxt = sc.nextInt();
        double heftelikMaas = 0;
        if (vaxt > 40){
            heftelikMaas = saatliqMaas*vaxt*1.20;
        }
        else {
            heftelikMaas = vaxt*saatliqMaas;
        }
        System.out.println("Iscinizin heftelik maasi: " + heftelikMaas);
    }
}
