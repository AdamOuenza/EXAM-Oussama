public class EspiralMatriz {

    public static int[][] crearMatriz(int n) {
        int[][] matriz = new int[n][n];
        int valor = 1;
        for (int fila = 0; fila < n; fila++) {
            for (int col = 0; col < n; col++) {
                matriz[fila][col] = valor++;
            }
        }
        return matriz;
    }

    public static void recorrerEspiral(int[][] matriz) {
        int inicioFila = 0, finFila = matriz.length - 1;
        int inicioCol = 0, finCol = matriz[0].length - 1;

        System.out.println("Recorrido en espiral:");
        while (inicioFila <= finFila && inicioCol <= finCol) {

            for (int col = inicioCol; col <= finCol; col++) {
                System.out.print(matriz[inicioFila][col] + " ");
            }
            inicioFila++;

            for (int fila = inicioFila; fila <= finFila; fila++) {
                System.out.print(matriz[fila][finCol] + " ");
            }
            finCol--;

            if (inicioFila <= finFila) {
                for (int col = finCol; col >= inicioCol; col--) {
                    System.out.print(matriz[finFila][col] + " ");
                }
                finFila--;
            }

            if (inicioCol <= finCol) {
                for (int fila = finFila; fila >= inicioFila; fila--) {
                    System.out.print(matriz[fila][inicioCol] + " ");
                }
                inicioCol++;
            }
        }
    }
}
