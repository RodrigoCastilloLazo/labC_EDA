package ejercicio1;

public class LibroDeTexto extends Libro<String> {
    public LibroDeTexto(String nombre, String autor, String curso) {
        super(nombre, autor, curso);
    }

    public String getCurso() {
        return getAtributoAdicional();
    }

    public void setCurso(String curso) {
        setAtributoAdicional(curso);
    }
}