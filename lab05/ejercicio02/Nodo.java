package ejercicio02;
public class Nodo<T extends Comparable<T>> {
    T data;
    Nodo<T> izquierda, derecha;

    public Nodo(T item) {
        data = item;
        izquierda = derecha = null;
    }
}
