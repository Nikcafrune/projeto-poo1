import java.util.List;

// Classe que verifica se o número é par e realiza soma
public class VerificaPar {

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int numero = 10;
        boolean resultado = ehPar(numero);
        System.out.println("O número " + numero + " é par? " + resultado);

        int soma = somar(5, 7);
        System.out.println("A soma é: " + soma);
    }
}

// Classe para inverter uma string
class InverterString {

    public static String inverter(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    public static void main(String[] args) {
        String original = "hello world";
        String invertida = inverter(original);
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
}

// Classe que calcula a média aritmética
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

// Classe que calcula o fatorial de um número
class Fatorial {

    public static long calcularFatorial(int numero) {
        long fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        int numero = 5;
        long resultado = calcularFatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + resultado);
    }
}

// Classe que conta vogais em uma string
class ContadorVogais {

    public static int contarVogais(String texto) {
        int contador = 0;
        String vogais = "aeiouAEIOU";

        for (char c : texto.toCharArray()) {
            if (vogais.indexOf(c) != -1) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        String exemplo = "ChatGPT é incrível!";
        int totalVogais = contarVogais(exemplo);
        System.out.println("Número de vogais: " + totalVogais);
    }
}

