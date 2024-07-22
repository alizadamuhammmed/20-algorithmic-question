public class Task3 {
    public static void main(String[] args) {
        int standart = 0;
        int sum = 0;
        for (int i = 2; i <=50 ; i++) {
            for (int j = 2; j <i ; j++) {
                if (i%j == 0){
                    standart+=1;
                }
            }
            if (standart==0){
                sum+=i;
            }
            standart = 0;
        }
        System.out.println(sum);
    }
}
