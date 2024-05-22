/**
 * ejercicio01
 */
public class ejercicio01 {

    public static void main(String[] args) {
        System.out.println(invertNumber(12345));
    }
    public static int invertNumber(int n) {
        if (Integer.toString(n).length() == 1) {
            return n;
        }else {
            int aux = n % 10;
            int large = Integer.toString(n).length();
            return (int) Math.pow(10, large - 1) * aux + invertNumber((n - aux)/10); 
        }
    }
}