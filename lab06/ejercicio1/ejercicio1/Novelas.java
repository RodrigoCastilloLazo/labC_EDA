package ejercicio1;

public class Novelas extends Libro<String> {
    public Novelas(String nombre, String autor, String tipo) {
        super(nombre, autor, tipo);
    }

    public String getTipo() {
        return getAtributoAdicional();
    }

    public void setTipo(String tipo) {
        setAtributoAdicional(tipo);
    }
}
