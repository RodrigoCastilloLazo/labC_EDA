package ejercicio01;
public class aplicacionCalculadora {
    public static void main(String[] args) {
        Calculadora<Integer> calculadoraInt = new Calculadora<>();
        System.out.println("Suma de enteros: " + calculadoraInt.suma(5, 3));
        System.out.println("Resta de enteros: " + calculadoraInt.resta(5, 3));
        System.out.println("Multiplicación de enteros: " + calculadoraInt.multiplicacion(5, 3));
        System.out.println("División de enteros: " + calculadoraInt.division(6, 3));

        Calculadora<Double> calculadoraDouble = new Calculadora<>();
        System.out.println("Suma de dobles: " + calculadoraDouble.suma(5.5, 3.3));
        System.out.println("Resta de dobles: " + calculadoraDouble.resta(5.5, 3.3));
        System.out.println("Multiplicación de dobles: " + calculadoraDouble.multiplicacion(5.5, 3.3));
        System.out.println("División de dobles: " + calculadoraDouble.division(6.6, 3.3));

        Calculadora<Float> calculadoraFloat = new Calculadora<>();
        System.out.println("Suma de floats: " + calculadoraFloat.suma(5.5f, 3.3f));
        System.out.println("Resta de floats: " + calculadoraFloat.resta(5.5f, 3.3f));
        System.out.println("Multiplicación de floats: " + calculadoraFloat.multiplicacion(5.5f, 3.3f));
        System.out.println("División de floats: " + calculadoraFloat.division(6.6f, 3.3f));
    }
}
