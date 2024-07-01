import java.util.NoSuchElementException;

class Pila<T> {
    private Nodo<T> cima;

    private static class Nodo<T> {
        T data;
        Nodo<T> next;

        Nodo(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public Pila() {
        this.cima = null;
    }

    public void push(T data) {
        Nodo<T> nuevoNodo = new Nodo<>(data);
        nuevoNodo.next = cima;
        cima = nuevoNodo;
    }

    public T pop() {
        if (cima == null) {
            throw new NoSuchElementException();
        }
        T data = cima.data;
        cima = cima.next;
        return data;
    }

    public T peek() {
        if (cima == null) {
            throw new NoSuchElementException();
        }
        return cima.data;
    }

    public boolean isEmpty() {
        return cima == null;
    }
}
