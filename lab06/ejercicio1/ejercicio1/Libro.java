package ejercicio1;

public class Libro {
    private String nombre;
    private String autor;
    private double precio;
    public Libro(String nombre, String autor){
        this.nombre = nombre;
        this.autor = autor;
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
    @Override
    public String toString() {
        String var = "\n";
        var += getNombre() + "\n" + getAutor();
        return var;
    }
}
