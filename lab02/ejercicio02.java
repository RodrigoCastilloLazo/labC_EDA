/**
 * ejercicio02
 */
public class ejercicio02 {

    public static void main(String[] args) {
        int numero = 54321;
        System.out.println("El número " + numero + " está ordenado de forma creciente: " + estaOrdenadoCreciente(numero));
        System.out.println("El número " + numero + " está ordenado de forma decreciente: " + estaOrdenadoDecreciente(numero));
    }
    public static boolean estaOrdenadoCreciente(int numero) {
        String numeroStr = Integer.toString(numero);
        for (int i = 0; i < numeroStr.length() - 1; i++) {
            if (numeroStr.charAt(i) > numeroStr.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean estaOrdenadoDecreciente(int numero) {
        String numeroStr = Integer.toString(numero);
        for (int i = 0; i < numeroStr.length() - 1; i++) {
            if (numeroStr.charAt(i) < numeroStr.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}