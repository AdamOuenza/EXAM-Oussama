public class Main {
    public static void main(String[] args) {
        int[][] matriz = EspiralMatriz.crearMatriz(9);

        System.out.println("Matriz 9x9:");
        for (int[] fila : matriz) {
            for (int val : fila) {
                System.out.printf("%3d ", val);
            }
            System.out.println();
        }

        System.out.println("\n-------------------------");
        EspiralMatriz.recorrerEspiral(matriz);
    }
}
