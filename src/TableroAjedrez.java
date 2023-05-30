public class TableroAjedrez {
    public static void main(String[] args) {
        char[][] tablero = new char[8][8];

        // Inicializar el tablero con las piezas
        tablero[0] = new char[]{'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'};
        tablero[1] = new char[]{'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'};
        tablero[6] = new char[]{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'};
        tablero[7] = new char[]{'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'};

        // Imprimir el tablero
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
