public class ContadorVogais {

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
