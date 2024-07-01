public class Main {
    public static void main(String[] args) {
        ejercicio2<Integer> cola = new ejercicio2<>();
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);
        cola.enqueue(9);
        cola.mostrar(); // Output: 1 -> 2 -> 3 -> 9 -> null
        System.out.println("Elemento en el frente: " + cola.peek()); // Output: 1
        System.out.println("Elemento desencolado: " + cola.dequeue()); // Output: 1
        cola.mostrar(); // Output: 2 -> 3 -> 9 -> null
        System.out.println("¿La cola está vacía? " + cola.isEmpty()); // Output: false
    }
}