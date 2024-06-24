import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1: Implementación de la lista enlazada genérica
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.mostrar();

        lista.eliminar(2);
        lista.mostrar();

        System.out.println("Buscar 3: " + lista.buscar(3));
        System.out.println("Buscar 2: " + lista.buscar(2));

        // Ejercicio 2: Realizar tareas con la lista enlazada
        ListaEnlazada<Integer> listaNumeros = new ListaEnlazada<>();
        Random random = new Random();

        // Crear una lista enlazada de números enteros positivos al azar
        for (int i = 0; i < 10; i++) {
            listaNumeros.agregar(random.nextInt(100) + 1); // Números entre 1 y 100
        }

        // Mostrar los elementos de la lista
        System.out.println("Elementos de la lista:");
        listaNumeros.mostrar();

        // Valor límite para eliminar nodos que superen este valor
        int valorLimite = 50;
        Nodo<Integer> actual = listaNumeros.getHead();
        while (actual != null) {
            if (actual.getDato() > valorLimite) {
                listaNumeros.eliminar(actual.getDato());
            }
            actual = actual.getNext();
        }

        // Mostrar los elementos de la lista después de la eliminación
        System.out.println("Elementos de la lista después de eliminar valores mayores que " + valorLimite + ":");
        listaNumeros.mostrar();
    }
}
