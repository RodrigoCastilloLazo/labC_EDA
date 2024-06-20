package ejercicio1;

public class Libro<T> {
    private String nombre;
    private String autor;
    private double precio;
    private T atributoAdicional;

    public Libro(String nombre, String autor, T atributoAdicional) {
        this.nombre = nombre;
        this.autor = autor;
        this.atributoAdicional = atributoAdicional;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getAutor() {
        return autor;
    }

    public String getNombre() {
        return nombre;
    }

    public T getAtributoAdicional() {
        return atributoAdicional;
    }

    public void setAtributoAdicional(T atributoAdicional) {
        this.atributoAdicional = atributoAdicional;
    }

    @Override
    public String toString() {
        return nombre + "\n" + autor + "\n" + atributoAdicional;
    }
}
