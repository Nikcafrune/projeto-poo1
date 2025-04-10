public class VerificaPar {

    public static boolean ehPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int numero = 10;
        boolean resultado = ehPar(numero);
        System.out.println("O número " + numero + " é par? " + resultado);
    }
}




