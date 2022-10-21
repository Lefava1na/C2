package Cwicz2;
import java.util.Random;

public class Zadanie3 {
    public static void main(String [] args) {
        Random r = new Random();

        int randomnumberMiazhuyeu = r.nextInt(100) + 1;

        if (randomnumberMiazhuyeu%2==0) {
            System.out.println("Liczba " + randomnumberMiazhuyeu + " jest parysta");
        }
        else System.out.println("Liczba " + randomnumberMiazhuyeu + "jest nieparysta");
    }
}
