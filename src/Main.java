public class InverterString {

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
