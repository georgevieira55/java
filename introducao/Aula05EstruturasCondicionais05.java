package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //Imprima o dia da semana, considerando 1 como domingo
        byte dia = 5;
        //char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sábado");
                break;
            default:
                System.out.println("opção inválida");
        }
        String sexo ="F";
        switch (sexo){
            case "M":
                System.out.println("homem");
                break;
            case "F":
                System.out.println("mulher");
                break;
            default:
                System.out.println("opção inválida");
                break;
        }
    }
}
