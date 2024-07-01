import java.util.NoSuchElementException;

public class Cola<T> {
    private Nodo<T> frente, fin;

    private static class Nodo<T> {
        T data;
        Nodo<T> next;

        Nodo(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Método para encolar (enqueue) un elemento en la cola
    public void enqueue(T data) {
        Nodo<T> nuevoNodo = new Nodo<>(data);
        if (fin == null) {
            frente = fin = nuevoNodo;
        } else {
            fin.next = nuevoNodo;
            fin = nuevoNodo;
        }
    }

    // Método para desencolar (dequeue) un elemento de la cola
    public T dequeue() {
        if (frente == null) {
            throw new NoSuchElementException();
        }
        T data = frente.data;
        frente = frente.next;
        if (frente == null) {
            fin = null;
        }
        return data;
    }

    // Método para ver el elemento en el frente de la cola
    public T peek() {
        if (frente == null) {
            throw new NoSuchElementException();
        }
        return frente.data;
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return frente == null;
    }

    // Método para mostrar todos los elementos de la cola
    public void mostrar() {
        Nodo<T> actual = frente;
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
        }
        System.out.println("null");
    }
}
