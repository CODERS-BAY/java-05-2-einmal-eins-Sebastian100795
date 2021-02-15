public class main {
    public static void main(String[] args) {

        int zahl = 1;
        int result = 0;

        for (int j = 1; j <= 10; j++) {

            for (int i = 1; i <= 10; i++) {
                result= i*zahl;
                System.out.println(i + "*" + zahl + "=" + result);
            }
            zahl++;
        }
    }
}
