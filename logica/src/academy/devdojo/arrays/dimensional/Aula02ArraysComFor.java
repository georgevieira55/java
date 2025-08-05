package academy.devdojo.arrays.dimensional;

import java.util.Scanner;

public class Aula02ArraysComFor {
    public static void main(String[] args) {
        double[] notas = new double[4];
        double media = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notas[i] = scanner.nextDouble();
            media = media + notas[i];

        }
        media = media / notas.length;
        System.out.println("Soma das notas: " + media);
    }
}
