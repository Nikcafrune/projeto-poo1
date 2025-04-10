import java.util.List;

public class VerificaPar {

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        int numero = 10;
        boolean resultado = ehPar(numero);
        System.out.println("O número " + numero + " é par? " + resultado);

        int soma = somar(5, 7);
        System.out.println("A soma é: " + soma);
    }

    public static int somar(int a, int b) {
        return a + b;
    }
}

class MediaAritmetica {

    public static double calcularMedia(List<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode ser nula ou vazia.");
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        return (double) soma / numeros.size();
    }

    public static void main(String[] args) {
        List<Integer> lista = List.of(10, 20, 30, 40, 50);
        double media = calcularMedia(lista);
        System.out.println("A média é: " + media);
    }
}

class Fatorial {

    public static long calcularFatorial(int numero) {
        long fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        int numero = 5; // Você pode trocar esse valor para testar
        long resultado = calcularFatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + resultado);
    }
}
