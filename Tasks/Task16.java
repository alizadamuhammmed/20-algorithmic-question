public class Task16 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            int cem = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    cem += j;
                }
            }
            if (cem == i) {
                System.out.print(i + " ");
            }
        }
    }
}
