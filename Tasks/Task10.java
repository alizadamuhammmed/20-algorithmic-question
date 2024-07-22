public class Task10 {
    public static void main(String[] args) {
        System.out.println(hasil(7, 12));
    }

    public static int hasil(int eded1, int eded2) {
        int temp = eded2;
        for (int i = 1; i < eded1; i++) {
            eded2 = eded2 + temp;
        }
        return eded2;
    }
}
