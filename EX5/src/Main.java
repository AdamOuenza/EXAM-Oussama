public class Main {
    public static void main(String[] args) {
        CipherTool.generarAlfabetoCifrado();

        String mensajeOriginal = "a rose by any other name would smell as sweet";

        String mensajeCifrado = CipherTool.cifrar(mensajeOriginal);

        String mensajeDescifrado = CipherTool.descifrar(mensajeCifrado);

        System.out.println("\nMensaje original  : " + mensajeOriginal);
        System.out.println("Mensaje cifrado   : " + mensajeCifrado);
        System.out.println("Mensaje descifrado: " + mensajeDescifrado);
    }
}
