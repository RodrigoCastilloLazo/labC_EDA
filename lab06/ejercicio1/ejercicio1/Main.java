package ejercicio1;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Libro l1 = new Libro("Libro Simple", "Juan");
        LibroDeTexto l2 = new LibroDeTexto("l2", "autor2", "fisica");
        LibroDeTextoUNSA l3 = new LibroDeTextoUNSA("libro3", "autor3", "quimica", "Sistemas");
        Novelas l4 = new Novelas("Libro4", "autor4", "Comedia");

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
    }
}