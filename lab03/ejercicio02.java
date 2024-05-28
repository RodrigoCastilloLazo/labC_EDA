public class ejercicio02 {

    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 9, 6, 3, 8, 1, 4};
        
        int[] minMax = encontrarMinMax(arr, 0, arr.length - 1);
        
        System.out.println("Mínimo: " + minMax[0]);
        System.out.println("Máximo: " + minMax[1]);
    }

    public static int[] encontrarMinMax(int[] arr, int inicio, int fin) {
        if (inicio == fin) {
            return new int[]{arr[inicio], arr[inicio]};
        }

        if (fin == inicio + 1) {
            if (arr[inicio] < arr[fin]) {
                return new int[]{arr[inicio], arr[fin]};
            } else {
                return new int[]{arr[fin], arr[inicio]};
            }
        }

        int medio = (inicio + fin) / 2;

        int[] x = encontrarMinMax(arr, inicio, medio);
        int[] y = encontrarMinMax(arr, medio + 1, fin);

        int min = Math.min(x[0], y[0]);
        int max = Math.max(x[1], y[1]);

        return new int[]{min, max};
    }
}
