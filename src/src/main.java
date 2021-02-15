public class main {
    public static void main(String[] args) {

        int zahl = 1;

        for (int j = 1; j <= 10; j++) {

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d * %d = %d \n", i, zahl, i * zahl);
            }
            zahl++;
        }
    }
}
