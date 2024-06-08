import java.util.List;
import java.util.Collections;

public class TestProblemaSaltosPDR {
    public static void main(String[] args) {
        AlgoritmoPD.isRandomize = true;
        List<Integer> numeros = List.of(3, 2, 1, 0, 4, 2, 1);
        ProblemaSaltosPDR problema = ProblemaSaltosPDR.create(numeros);
        AlgoritmoPD<ProblemaSaltosPDR, Integer> algoritmo = AlgoritmoPD.createPDR(problema);
        algoritmo.ejecuta();

        List<Integer> solucion = algoritmo.getSolucion();
        Collections.reverse(solucion);
        if (!solucion.isEmpty()) {
            solucion.remove(solucion.size() - 1);
        }
        System.out.println("Menor número de movimientos: " + solucion.size());
        System.out.println("Saltos: " + solucion);
    }
}
