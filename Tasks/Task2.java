public class Task2 {
    public static void main(String[] args) {
        int standart = 0;
        for (int i = 2; i <=20 ; i++) {
            for (int j = 2; j <i ; j++) {
                if (i%j == 0){
                    standart+=1;
                }
            }
            if (standart==0){
                System.out.println(i);
            }
            standart = 0;
        }
    }
}
