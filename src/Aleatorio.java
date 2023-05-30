import java.util.concurrent.ThreadLocalRandom;

public class Aleatorio {
    public static void main(String[] args) {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 10000);
        String formattedNum = String.format("%04d", randomNum);
        System.out.println("Número aleatorio: " + formattedNum);
    }
}
