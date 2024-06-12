package ejercicio01;
// Calculadora.java
public class Calculadora<T extends Number> {

    public T suma(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double && b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Float && b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        }
        throw new IllegalArgumentException("Tipo de dato no soportado");
    }

    public T resta(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        } else if (a instanceof Double && b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else if (a instanceof Float && b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() - b.floatValue());
        }
        throw new IllegalArgumentException("Tipo de dato no soportado");
    }

    public T multiplicacion(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        } else if (a instanceof Double && b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else if (a instanceof Float && b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() * b.floatValue());
        }
        throw new IllegalArgumentException("Tipo de dato no soportado");
    }

    public T division(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        } else if (a instanceof Double && b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
        } else if (a instanceof Float && b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() / b.floatValue());
        }
        throw new IllegalArgumentException("Tipo de dato no soportado");
    }
}
