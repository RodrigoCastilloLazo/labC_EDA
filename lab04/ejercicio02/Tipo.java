package ejercicio02;

public enum Tipo {
    Min {
        @Override
        public boolean mejor(double valor1, double valor2) {
            return valor1 < valor2;
        }
    },
    Max {
        @Override
        public boolean mejor(double valor1, double valor2) {
            return valor1 > valor2;
        }
    };  
    public abstract boolean mejor(double valor1, double valor2);
}
