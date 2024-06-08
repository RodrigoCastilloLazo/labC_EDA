package ejercicio02;

import java.util.*;

public interface ProblemaPDR<S, A, P extends ProblemaPDR<S, A, P>> {
    List<A> getSolucionReconstruidaCasoBase(Sp<A> sp);

    List<A> getSolucionReconstruidaCasoRecursivo(Sp<A> sp, List<A> s);

    List<A> getAlternativas();

    P getSubProblema(A alternativa);

    Sp<A> getSolucionParcialPorAlternativa(A alternativa, Sp<A> spAnterior);

    Sp<A> getSolucionParcialCasoBase();

    boolean esCasoBase();

    Tipo getTipo();
}
