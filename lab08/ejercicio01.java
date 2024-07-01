import java.util.*;
public class ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.print("Ingrese una palabra: ");
        word = sc.nextLine();
        System.out.println("Palabra invertida: " + invertirPalabra(word));
        invertirPalabra(word);
    }
    public static String invertirPalabra(String word) {
        String var = "";
        Cola<String> c1 = new Cola<>();
        for (int i = 0; i < word.length(); i++) {
            c1.enqueue(word.substring(word.length() - 1 - i, word.length() - i)); 
        }
        for (int i = 0; i < word.length(); i++) {          
            var += c1.dequeue();
        }
        return var;
    }
}



















