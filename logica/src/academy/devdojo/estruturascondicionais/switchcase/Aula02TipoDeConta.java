package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class Aula02TipoDeConta {
    public static void main(String[] args) {
        String conta;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tipo de conta : ");
        conta = scanner.nextLine();
        switch (conta) {
            case "CONTA POUPANÇA":
                System.out.println("0.05%");
                break;
            case "CONTA CORRENTE":
                System.out.println("0.02%");
                break;
            case "CONTA INVESTIMENTO":
                System.out.println("0.1%");
                break;
            default:
                System.out.println("CONTA INEXISTENTE");
        }
    }
}
