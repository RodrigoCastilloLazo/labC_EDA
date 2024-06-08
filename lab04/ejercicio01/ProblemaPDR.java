import java.util.List;

public interface ProblemaPDR<A, P> {
    List<A> getAlternativas();
    P getSubProblema(A a);
    Sp<A> getSolucionParcialPorAlternativa(A a, Sp<A> sp);
    boolean esCasoBase();
    Sp<A> getSolucionParcialCasoBase();
    List<A> getSolucionReconstruidaCasoBase(Sp<A> sp);
    List<A> getSolucionReconstruidaCasoRecursivo(Sp<A> sp, List<A> s);
    int size();
    Tipo getTipo();
}
