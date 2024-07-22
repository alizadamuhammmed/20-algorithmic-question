public class Task15 {
    public static void main(String[] args) {
        int eded = 6;
        int cem = 0;
        for (int i = 1; i < eded; i++) {
            if (eded % i == 0) {
                cem += i;
            }
        }
        if (cem == eded) {
            System.out.println(eded + " ededi mukemmel ededdir.");
        }
        else {
            System.out.println("deyil");
        }
    }
}
