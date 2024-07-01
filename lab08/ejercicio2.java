import java.util.NoSuchElementException;


public class ejercicio2<T> {
    private Pila<T> pilaEnqueue;
    private Pila<T> pilaDequeue;

    public ejercicio2() {
        pilaEnqueue = new Pila<>();
        pilaDequeue = new Pila<>();
    }

    public void enqueue(T data) {
        pilaEnqueue.push(data);
    }

    public T dequeue() {
        if (pilaDequeue.isEmpty()) {
            while (!pilaEnqueue.isEmpty()) {
                pilaDequeue.push(pilaEnqueue.pop());
            }
        }
        if (pilaDequeue.isEmpty()) {
            throw new NoSuchElementException();
        }
        return pilaDequeue.pop();
    }

    public boolean isEmpty() {
        return pilaEnqueue.isEmpty() && pilaDequeue.isEmpty();
    }

    public T peek() {
        if (pilaDequeue.isEmpty()) {
            while (!pilaEnqueue.isEmpty()) {
                pilaDequeue.push(pilaEnqueue.pop());
            }
        }
        if (pilaDequeue.isEmpty()) {
            throw new NoSuchElementException();
        }
        return pilaDequeue.peek();
    }

    public void mostrar() {
        if (!pilaDequeue.isEmpty()) {
            Pila<T> tempStack = new Pila<>();
            while (!pilaDequeue.isEmpty()) {
                tempStack.push(pilaDequeue.pop());
            }
            while (!tempStack.isEmpty()) {
                T data = tempStack.pop();
                System.out.print(data + " -> ");
                pilaDequeue.push(data);
            }
        }
        Pila<T> tempStack = new Pila<>();
        while (!pilaEnqueue.isEmpty()) {
            tempStack.push(pilaEnqueue.pop());
        }
        while (!tempStack.isEmpty()) {
            T data = tempStack.pop();
            System.out.print(data + " -> ");
            pilaEnqueue.push(data);
        }
        System.out.println("null");
    }
}


