import java.util.*;

public class AlgoritmoPD<P extends ProblemaPDR<A, P>, A> {
    private P problema;
    private List<A> solucion;
    public static boolean isRandomize = false;

    private AlgoritmoPD(P problema) {
        this.problema = problema;
    }

    public static <P extends ProblemaPDR<A, P>, A> AlgoritmoPD<P, A> createPDR(P problema) {
        return new AlgoritmoPD<>(problema);
    }

    public void ejecuta() {
        solucion = resolver(problema);
    }

    private List<A> resolver(P problema) {
        if (problema.esCasoBase()) {
            return problema.getSolucionReconstruidaCasoBase(problema.getSolucionParcialCasoBase());
        }

        List<A> mejorSolucion = null;
        Sp<A> mejorSp = null;

        for (A alternativa : problema.getAlternativas()) {
            P subProblema = problema.getSubProblema(alternativa);
            Sp<A> sp = problema.getSolucionParcialPorAlternativa(alternativa, problema.getSolucionParcialCasoBase());

            if (sp != null) {
                List<A> subSolucion = resolver(subProblema);
                List<A> solucionActual = problema.getSolucionReconstruidaCasoRecursivo(sp, subSolucion);

                if (mejorSolucion == null || problema.getTipo().mejor(sp.propiedad, mejorSp.propiedad)) {
                    mejorSolucion = solucionActual;
                    mejorSp = sp;
                }
            }
        }

        return mejorSolucion;
    }

    public List<A> getSolucion() {
        return solucion;
    }
}
