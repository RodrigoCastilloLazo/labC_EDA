package ejercicio02;

import java.util.List;

public class TestProblemaSaltosPDR {
    public static void main(String[] args) {
        List<String> propiedades = List.of("ConocimientosEquipo", "Plazo", "Escalabilidad", "Seguridad", "RecursosParaCalidad", "Complejidad", "Fiabilidad", "Interoperabilidad");
        int[][] contribuciones = {
            {-1,  1,  1, -1,  0}, 
            {-1,  1,  0,  0, -1}, 
            { 1,  1,  1,  0, -1}, 
            { 1,  1,  0,  1, -1}, 
            {-1,  0, -1, -1,  0}, 
            { 1,  0,  0,  0, -1}, 
            { 0,  1,  0, -1,  1}, 
            { 1,  0,  1,  0, -1}  
        };
        int maxPropAFavorecer = 4;
        int sumaMaxPorRiesgo = 2;

        ProblemaSaltosPDR problema = new ProblemaSaltosPDR(propiedades, contribuciones, maxPropAFavorecer, sumaMaxPorRiesgo);
        AlgoritmoPD<ProblemaSaltosPDR, List<Integer>, Integer> algoritmo = AlgoritmoPD.createPDR(problema);
        algoritmo.ejecuta();

        List<Integer> solucion = algoritmo.getSolucion();
        System.out.println("Menor número de movimientos: " + solucion.size());
        System.out.println("Saltos: " + solucion);
    }
}
