// ArbolBinarioBusqueda.java
public class ArbolBinarioBusqueda<T extends Comparable<T>> {
    private Nodo<T> raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    // Método para insertar un nuevo nodo en el árbol
    public void insertar(T key) {
        raiz = insertarRec(raiz, key);
    }

    private Nodo<T> insertarRec(Nodo<T> raiz, T key) {
        if (raiz == null) {
            raiz = new Nodo<>(key);
            return raiz;
        }

        if (key.compareTo(raiz.data) < 0)
            raiz.izquierda = insertarRec(raiz.izquierda, key);
        else if (key.compareTo(raiz.data) > 0)
            raiz.derecha = insertarRec(raiz.derecha, key);

        return raiz;
    }

    // Método para realizar un recorrido en orden y verificar la estructura
    public void inOrder() {
        inOrderRec(raiz);
    }

    private void inOrderRec(Nodo<T> raiz) {
        if (raiz != null) {
            inOrderRec(raiz.izquierda);
            System.out.print(raiz.data + " ");
            inOrderRec(raiz.derecha);
        }
    }
}
