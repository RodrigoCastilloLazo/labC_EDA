public class ejercicio01 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 6};
        
        System.out.println(arrysIgualesDyV(arr1, arr2)); 
        System.out.println(arrysIgualesDyV(arr1, arr3)); 
    }

    public static boolean arrysIgualesDyV(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        return compararArreglos(arr1, arr2, 0, arr1.length - 1);
    }

    private static boolean compararArreglos(int[] arr1, int[] arr2, int inicio, int fin) {
        if (inicio == fin) {
            return arr1[inicio] == arr2[inicio];
        }

        int medio = (inicio + fin) / 2;

        boolean x = compararArreglos(arr1, arr2, inicio, medio);
        boolean y = compararArreglos(arr1, arr2, medio + 1, fin);

        return x && y;
    }
}
