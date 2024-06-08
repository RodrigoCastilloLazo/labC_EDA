public enum Tipo {
    Min {
        @Override
        public boolean mejor(double propiedad1, double propiedad2) {
            return propiedad1 < propiedad2;
        }
    },
    Max {
        @Override
        public boolean mejor(double propiedad1, double propiedad2) {
            return propiedad1 > propiedad2;
        }
    };

    public abstract boolean mejor(double propiedad1, double propiedad2);
}
