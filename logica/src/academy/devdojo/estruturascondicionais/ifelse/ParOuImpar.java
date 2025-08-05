package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
            int numero ; // Altere este valor para verificar outros números
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o numero : ");
        numero = scanner.nextInt();
            if ( numero % 2 == 0) {
                System.out.println(" par.");
            } else {
                System.out.println(" impar.");
            }
        }
    }

