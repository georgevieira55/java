package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7 ,sendo 1 domingo, imprima se é dia utel oou fim de semana
        byte dia = 1;
        //char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("fim de semana");
                break;
            case 2:
                System.out.println("dia útil");
                break;
            case 3:
                System.out.println("dia útil");
                break;
            case 4:
                System.out.println("dia útil");
                break;
            case 5:
                System.out.println("dia útil");
                break;
            case 6:
                System.out.println("dia útil");
                break;
            case 7:
                System.out.println("fim de semana");
                break;
            default:
                System.out.println("opção invalida");
                break;
            }
        }
    }
