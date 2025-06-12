import java.util.*;

public class CipherTool {
    private static final String ALFABETO = "abcdefghijklmnopqrstuvwxyz";
    private static String alfabetoCifrado;

    public static void generarAlfabetoCifrado() {
        List<Character> letras = new ArrayList<>();
        for (char c : ALFABETO.toCharArray()) {
            letras.add(c);
        }
        Collections.shuffle(letras);
        StringBuilder sb = new StringBuilder();
        for (char c : letras) {
            sb.append(c);
        }
        alfabetoCifrado = sb.toString();

        System.out.println("Alfabeto original : " + ALFABETO);
        System.out.println("Alfabeto cifrado  : " + alfabetoCifrado);
    }

    public static String cifrar(String mensaje) {
        mensaje = mensaje.toLowerCase();
        StringBuilder cifrado = new StringBuilder();
        for (char c : mensaje.toCharArray()) {
            if (Character.isLetter(c)) {
                int indice = ALFABETO.indexOf(c);
                cifrado.append(alfabetoCifrado.charAt(indice));
            } else {
                cifrado.append(c);
            }
        }
        return cifrado.toString();
    }

    public static String descifrar(String mensajeCifrado) {
        mensajeCifrado = mensajeCifrado.toLowerCase();
        StringBuilder descifrado = new StringBuilder();
        for (char c : mensajeCifrado.toCharArray()) {
            if (Character.isLetter(c)) {
                int indice = alfabetoCifrado.indexOf(c);
                descifrado.append(ALFABETO.charAt(indice));
            } else {
                descifrado.append(c);
            }
        }
        return descifrado.toString();
    }
}
