package ejercicio1;

public class LibroDeTextoUNSA extends LibroDeTexto {
    private String facultad;

    public LibroDeTextoUNSA(String nombre, String autor, String curso, String facultad) {
        super(nombre, autor, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + facultad;
    }
}
