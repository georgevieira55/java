package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        String sexo;
        int idade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite Seu Sexo");
        sexo = scanner.nextLine();
        System.out.println("Digite Sua Idade");
        idade = scanner.nextInt();
        if ((sexo.equals("M") || sexo.equals("F")) && (idade < 18)) {
            System.out.println("Alistamento não permitido");
        } else if (sexo.equals("M") && idade >= 18) {
            System.out.println("Alistamento obrigatório");
        } else if (sexo.equals("F") && idade >= 18) {
            System.out.println("Deseja se alistar");
        }
    }
}
