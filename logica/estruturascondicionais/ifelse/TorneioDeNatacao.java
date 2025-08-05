package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        String nome = "Luffy ";
        int idade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua Idade");
        idade = scanner.nextInt();
        if (idade <= 10) {
            System.out.println(nome + "participará da categoria infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + "participará da categoria juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + "participará da categoria pré-adulto");
        } else {
            System.out.println(nome + "participará da categoria adulto");

        }
    }
}
