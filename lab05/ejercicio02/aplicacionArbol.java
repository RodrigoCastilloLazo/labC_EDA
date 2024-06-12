package ejercicio02;
import java.util.Random;

public class aplicacionArbol {
    public static void main(String[] args) {
        ArbolBinarioBusqueda<Integer> arbol = new ArbolBinarioBusqueda<>();
        Random rand = new Random();

        // Insertar 100 datos aleatorios en el árbol
        for (int i = 0; i < 100; i++) {
            int num = rand.nextInt(1000); // Genera un número aleatorio entre 0 y 999
            arbol.insertar(num);
        }

        // Realizar un recorrido en orden para verificar la estructura del árbol
        System.out.println("Recorrido en orden del árbol binario de búsqueda:");
        arbol.inOrder();
    }
}
