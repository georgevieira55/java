package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04ExercicioLogin {
    public static void main(String[] args) {
        final String login = "Lufty";
        final String password = "ReiDosPiratas";
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Digite seu Login");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite sua Senha");
            String passwordDigitado = scanner.nextLine();
            if(login.equals(loginDigitado) && password.equals(passwordDigitado)){
                System.out.println("Acesso Concedido");
                break;
            }
            System.out.println("Acesso Negado");
        }
        System.out.println("Programa Terminado");
    }
}
