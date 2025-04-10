import java.util.List;

public class MediaAritmetica {

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
        double media = calcular
