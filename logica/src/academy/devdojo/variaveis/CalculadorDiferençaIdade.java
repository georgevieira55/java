package academy.devdojo.variaveis;

import java.util.Scanner;

public class CalculadorDiferençaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fristAge;
        int secondAge;
        System.out.println("Digite a primeira idade : ");
        fristAge = scanner.nextInt();
        System.out.println("digite a segunda idade :");
        secondAge = scanner.nextInt();
        int ageDiference = fristAge - secondAge;

        System.out.println("A diferença entre idades eh: "+ ageDiference);
    }
}
