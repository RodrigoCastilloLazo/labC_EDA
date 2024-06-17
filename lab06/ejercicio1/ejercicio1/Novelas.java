package ejercicio1;

/**
 * Novelas
 */
public class Novelas extends Libro{
    private String tipo;
    public Novelas(String nombre, String autor, String tipo) {
        super(nombre, autor);
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + getTipo();
    }
}