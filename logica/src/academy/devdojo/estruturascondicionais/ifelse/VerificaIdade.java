package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        int idade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade : ");
        idade = scanner.nextInt();
        if (idade >= 18){
            System.out.println("Adulto");
        }else {
            System.out.println("Criança");
        }
    }
}
