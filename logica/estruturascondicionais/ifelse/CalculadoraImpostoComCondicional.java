package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float salario;
        System.out.println("Digite o seu salário: ");
        salario = scanner.nextFloat();
        if (salario > 4500) {
            float trintaPorCento = salario * 0.3F;
            System.out.println("30% = " + trintaPorCento);
        } else {
            float dezPorCento = salario * 0.1F;
            System.out.println("10% = " + dezPorCento);
        }
    }
}
