package academy.devdojo.maratonajava.javacore.Oexeption.runtime.test;

public class RuntimeExeptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados noo arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
    private static String abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados noo arquivo");
            throw new RuntimeException();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }

    }
}
