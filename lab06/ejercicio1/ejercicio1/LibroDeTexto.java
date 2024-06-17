package ejercicio1;
/**
 * LibroDeTexto
 */
public class LibroDeTexto extends Libro{
    private String curso;
    public LibroDeTexto(String nombre, String autor, String curso) {
        super(nombre, autor);
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + getCurso();
    }
}