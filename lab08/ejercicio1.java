public class ejercicio1 {
    public static void main(String[] args) {
        String entrada = "Hola";
        String salida = invertirCadena(entrada);
        System.out.println("Cadena invertida: " + salida); // Debería imprimir "aloH"
    }

    public static String invertirCadena(String cadena) {
        Pila<Character> pila = new Pila<>();
        
        for (int i = 0; i < cadena.length(); i++) {
            pila.push(cadena.charAt(i));
        }
        
        StringBuilder cadenaInvertida = new StringBuilder();
        
        while (!pila.isEmpty()) {
            cadenaInvertida.append(pila.pop());
        }
        
        return cadenaInvertida.toString();
    }
}
