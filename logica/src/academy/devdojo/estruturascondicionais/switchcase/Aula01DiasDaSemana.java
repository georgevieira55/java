package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class Aula01DiasDaSemana {
    public static void main(String[] args) {
        int dia;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia : ");
        dia = scanner.nextInt();
        switch (dia) {
            case 1:
                System.out.println("segunda");
                break;
            case 2:
                System.out.println("terça");
                break;
            case 3:
                System.out.println("quarta");
                break;
            case 4:
                System.out.println("quinta");
                break;
            case 5:
                System.out.println("sexta");
                break;
            case 6:
                System.out.println("sábado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("Dia Inválido");
        }
        System.out.println("Fim Do Programa");
    }
}
