package Cwicz2;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String args[]) {
    float earthWeightMiazhuyeu = 95;
    float marsWeightMiazhuyeu = 0.38f * earthWeightMiazhuyeu;
    System.out.println("Waga na Marsie Daniila = " + marsWeightMiazhuyeu);

    double resultMarsWeightMiazhuyeu = marsWeightMiazhuyeu;
    System.out.println("Waga na Marsie Daniila(double) = " + resultMarsWeightMiazhuyeu);

    System.out.println("Waga na Marsie Daniila(double, 4):");
    System.out.format("%.4f", resultMarsWeightMiazhuyeu);

    int resultIntMarsWeightMiazhuyeu = (int) resultMarsWeightMiazhuyeu;
    System.out.println("\nWaga na Marsie Daniila(int):" + resultIntMarsWeightMiazhuyeu);

    char resultCharMarsWeightMiazhuyeu = (char) resultMarsWeightMiazhuyeu;
    System.out.println("\nWaga na Marsie Daniila(char):" + resultIntMarsWeightMiazhuyeu);

    resultCharMarsWeightMiazhuyeu += 'A';
    System.out.println("Dzialanie matematyczne ze zmienna + A: " + resultCharMarsWeightMiazhuyeu);

    int wynikDzialania = resultCharMarsWeightMiazhuyeu;
    System.out.println("Wynik dzialania matymatycznego z char do int: " + wynikDzialania);





    }
}
