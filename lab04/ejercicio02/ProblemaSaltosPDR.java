package ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class ProblemaSaltosPDR implements ProblemaPDR<List<Integer>, Integer, ProblemaSaltosPDR> {
    private List<String> propiedades;
    private int[][] contribuciones;
    private int maxPropAFavorecer;
    private int sumaMaxPorRiesgo;
    private int posActual;

    public ProblemaSaltosPDR(List<String> propiedades, int[][] contribuciones, int maxPropAFavorecer, int sumaMaxPorRiesgo) {
        this.propiedades = propiedades;
        this.contribuciones = contribuciones;
        this.maxPropAFavorecer = maxPropAFavorecer;
        this.sumaMaxPorRiesgo = sumaMaxPorRiesgo;
        this.posActual = 0;
    }

    @Override
    public List<Integer> getSolucionReconstruidaCasoBase(Sp<Integer> sp) {
        List<Integer> res = new ArrayList<>();
        res.add(sp.alternativa);
        return res;
    }

    @Override
    public List<Integer> getSolucionReconstruidaCasoRecursivo(Sp<Integer> sp, List<Integer> s) {
        List<Integer> res;
        if (s != null) {
            res = new ArrayList<>(s);
        } else {
            res = new ArrayList<>();
        }
        res.add(sp.alternativa);
        return res;
    }

    @Override
    public List<Integer> getAlternativas() {
        List<Integer> alternativas = new ArrayList<>();
        for (int i = 0; i < propiedades.size(); i++) {
            alternativas.add(i);
        }
        return alternativas;
    }

    @Override
    public ProblemaSaltosPDR getSubProblema(Integer a) {
        ProblemaSaltosPDR subProblema = new ProblemaSaltosPDR(this.propiedades, this.contribuciones, this.maxPropAFavorecer, this.sumaMaxPorRiesgo);
        subProblema.posActual = this.posActual + 1;
        return subProblema;
    }

    @Override
    public Sp<Integer> getSolucionParcialPorAlternativa(Integer a, Sp<Integer> spAnterior) {
        int contribucion = 0;
        for (int i = 0; i < contribuciones[a].length; i++) {
            contribucion += contribuciones[a][i];
        }
        Sp<Integer> res = Sp.create(a, spAnterior.propiedad + contribucion);
        return res;
    }

    @Override
    public Sp<Integer> getSolucionParcialCasoBase() {
        return Sp.create(0, 0.0);
    }

    @Override
    public boolean esCasoBase() {
        return posActual == maxPropAFavorecer;
    }

    @Override
    public Tipo getTipo() {
        return Tipo.Min;
    }
}
