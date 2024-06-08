public class Sp<T> {
    public T alternativa;
    public double propiedad;

    private Sp(T alternativa, double propiedad) {
        this.alternativa = alternativa;
        this.propiedad = propiedad;
    }

    public static <T> Sp<T> create(T alternativa, double propiedad) {
        return new Sp<>(alternativa, propiedad);
    }
}
