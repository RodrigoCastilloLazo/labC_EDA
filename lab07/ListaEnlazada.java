public class ListaEnlazada<T> {
    private Nodo<T> head;

    public ListaEnlazada() {
        this.head = null;
    }
    public Nodo<T> getHead() {
        return head;
    }

    public void agregar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (head == null) {
            head = nuevoNodo;
        } else {
            Nodo<T> actual = head;
            while (actual.getNext() != null) {
                actual = actual.getNext();
            }
            actual.setNext(nuevoNodo);
        }
    }

    public void mostrar() {
        Nodo<T> actual = head;
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getNext();
        }
        System.out.println();
    }

    public void eliminar(T dato) {
        if (head == null) return;

        if (head.getDato().equals(dato)) {
            head = head.getNext();
            return;
        }

        Nodo<T> actual = head;
        while (actual.getNext() != null && !actual.getNext().getDato().equals(dato)) {
            actual = actual.getNext();
        }

        if (actual.getNext() != null) {
            actual.setNext(actual.getNext().getNext());
        }
    }

    public boolean buscar(T dato) {
        Nodo<T> actual = head;
        while (actual != null) {
            if (actual.getDato().equals(dato)) {
                return true;
            }
            actual = actual.getNext();
        }
        return false;
    }
}
