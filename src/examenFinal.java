public class examenFinal {

    public static int contadorConsumosAltos(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int consumo : fila) {
                if (consumo > 8) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static double promedioConsumoM(int[][] matriz) {
        int suma = 0;
        int cantidad = 0;
        for (int[] fila : matriz) {
            for (int consumo : fila) {
                if (consumo >= 4 && consumo <= 7) {
                    suma += consumo;
                    cantidad++;
                }
            }
        }
        return cantidad > 0 ? (double) suma / cantidad : 0.0;
    }

    public static void printConsumosBajos(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 3) {
                    System.out.println("Consumo bajo de " + matriz[i][j] + " galones en la posición [" + i + "][" + j + "]");
                }
            }
        }
    }

    public static int[] posicionConsumoMax(int[][] matriz) {
        int max = matriz[0][0];
        int[] posicion = {0, 0};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }

    public static void main(String[] args) {
        int[][] consumo = {
            {5, 2, 9, 7},
            {3, 8, 4, 1},
            {6, 10, 2, 5}
        };

        System.out.println("Consumos mayores a 8 galones: " + contadorConsumosAltos(consumo));
        System.out.println("Promedio de consumos moderados (4-7 galones): " + promedioConsumoM(consumo));
        System.out.println("Consumos bajos (<3 galones):");
        printConsumosBajos(consumo);

        int[] maxPos = posicionConsumoMax(consumo);
        System.out.println("Consumo máximo en la posición [" + maxPos[0] + "][" + maxPos[1] + "]");

    }
}

