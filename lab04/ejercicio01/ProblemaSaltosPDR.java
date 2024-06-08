import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProblemaSaltosPDR implements ProblemaPDR<Integer, ProblemaSaltosPDR> {
    private List<Integer> numeros;
    private List<Integer> alReves;
    private Integer estadoInvertido;
    private Integer posicionActual;

    public ProblemaSaltosPDR(List<Integer> numeros, List<Integer> alReves, Integer estadoInvertido, Integer posicionActual) {
        this.numeros = new ArrayList<>(numeros);
        this.alReves = new ArrayList<>(alReves);
        this.estadoInvertido = estadoInvertido;
        this.posicionActual = posicionActual;
    }

    public static ProblemaSaltosPDR create(List<Integer> numeros) {
        List<Integer> alReves = new ArrayList<>(numeros);
        Collections.reverse(alReves);
        return new ProblemaSaltosPDR(numeros, alReves, 0, 0);
    }

    @Override
    public List<Integer> getSolucionReconstruidaCasoBase(Sp<Integer> sp) {
        List<Integer> solucion = new ArrayList<>();
        solucion.add(sp.alternativa);
        return solucion;
    }

    @Override
    public List<Integer> getSolucionReconstruidaCasoRecursivo(Sp<Integer> sp, List<Integer> solucionAnterior) {
        List<Integer> solucion = solucionAnterior != null ? new ArrayList<>(solucionAnterior) : new ArrayList<>();
        solucion.add(sp.alternativa);
        return solucion;
    }

    @Override
    public List<Integer> getAlternativas() {
        List<Integer> alternativas = new ArrayList<>();
        List<Integer> listaActual = (estadoInvertido == 0) ? numeros : alReves;

        for (int i = 1; i <= listaActual.get(posicionActual); i++) {
            if ((posicionActual + i) < listaActual.size()) {
                alternativas.add(i);
            }
        }
        return alternativas;
    }

    @Override
    public ProblemaSaltosPDR getSubProblema(Integer salto) {
        int nuevaPosicion = posicionActual + salto;
        return new ProblemaSaltosPDR(numeros, alReves, estadoInvertido, nuevaPosicion);
    }

    @Override
    public Sp<Integer> getSolucionParcialPorAlternativa(Integer salto, Sp<Integer> spAnterior) {
        return Sp.create(salto, spAnterior.propiedad + 1);
    }

    @Override
    public int size() {
        return numeros.size() - 1 - posicionActual;
    }

    @Override
    public boolean esCasoBase() {
        return posicionActual == numeros.size() - 1;
    }

    @Override
    public Sp<Integer> getSolucionParcialCasoBase() {
        return (estadoInvertido == 0) ? Sp.create(0, 0.0) : null;
    }

    @Override
    public Tipo getTipo() {
        return Tipo.Min;
    }
}
