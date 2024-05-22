/**
 * ejercicio03
 */
public class ejercicio03 {

    public static void main(String[] args) {
        System.out.println(palindromo("srtrs"));   
    }
    public static boolean palindromo(String str) {
        String aux = "";
        for (int i = str.length(); i > 0; i--) {
            aux = aux + str.substring(i - 1, i);
        }
        return aux.equals(str);
        
    }
}