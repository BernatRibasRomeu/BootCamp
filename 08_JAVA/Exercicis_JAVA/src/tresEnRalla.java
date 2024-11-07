import java.util.Scanner;
import java.util.Random;

public class tresEnRalla {
    static char[][] tablero = {
        {' ', '1', '2', '3'},
        {'1', ' ', ' ', ' '}, 
        {'2', ' ', ' ', ' '}, 
        {'3', ' ', ' ', ' '}
    };
    static Scanner scan = new Scanner(System.in);
    static char jugador = 'X';  // 'X' siempre empieza

    public static void main(String[] args) {
        System.out.println("Bienvenido al Tres en Raya!");
        System.out.println("Seleccione el modo de juego:");
        System.out.println("1. Humano vs Humano");
        System.out.println("2. Humano vs CPU");
        System.out.println("3. CPU vs CPU");
        System.out.print("Opción: ");
        int opcion = scan.nextInt();

        switch (opcion) {
            case 1:
                jugarHumanoVsHumano();
                break;
            case 2:
                jugarHumanoVsCPU();
                break;
            case 3:
                jugarCPUVsCPU();
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    // Método para jugar Humano vs Humano
    public static void jugarHumanoVsHumano() {
        while (true) {
            mostrarTablero();
            jugarTurno(jugador);
            if (esGanador(jugador)) {
                mostrarTablero();
                System.out.println("¡El jugador " + jugador + " ha ganado!");
                break;
            } else if (esEmpate()) {
                mostrarTablero();
                System.out.println("¡Empate!");
                break;
            }
            jugador = (jugador == 'X') ? 'O' : 'X'; // Cambiar turno
        }
    }

    // Método para jugar Humano vs CPU
    public static void jugarHumanoVsCPU() {
        while (true) {
            mostrarTablero();
            if (jugador == 'X') {
                jugarTurno(jugador);
            } else {
                jugarTurnoCPU();
            }
            if (esGanador(jugador)) {
                mostrarTablero();
                System.out.println("¡El jugador " + jugador + " ha ganado!");
                break;
            } else if (esEmpate()) {
                mostrarTablero();
                System.out.println("¡Empate!");
                break;
            }
            jugador = (jugador == 'X') ? 'O' : 'X'; // Cambiar turno
        }
    }

    // Método para jugar CPU vs CPU
    public static void jugarCPUVsCPU() {
        while (true) {
            mostrarTablero();
            jugarTurnoCPU();
            if (esGanador(jugador)) {
                mostrarTablero();
                System.out.println("¡El jugador " + jugador + " ha ganado!");
                break;
            } else if (esEmpate()) {
                mostrarTablero();
                System.out.println("¡Empate!");
                break;
            }
            jugador = (jugador == 'X') ? 'O' : 'X'; // Cambiar turno
        }
    }

    // Método para mostrar el tablero
    public static void mostrarTablero() {
        System.out.println("-------------");
        for (int i = 1; i <= 3; i++) {
            System.out.print("| ");
            for (int j = 1; j <= 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Método para jugar el turno de un jugador (humano)
    public static void jugarTurno(char jugador) {
        int fila, col;
        while (true) {
            System.out.println("Turno del jugador " + jugador);
            System.out.print("Introduce la fila (1-3): ");
            fila = scan.nextInt();
            System.out.print("Introduce la columna (1-3): ");
            col = scan.nextInt();
            if (fila >= 1 && fila <= 3 && col >= 1 && col <= 3 && tablero[fila][col] == ' ') {
                tablero[fila][col] = jugador;
                break;
            } else {
                System.out.println("Movimiento no válido, intenta de nuevo.");
            }
        }
    }

    // Método para jugar el turno de la CPU (random)
    public static void jugarTurnoCPU() {
        Random rand = new Random();
        int fila, col;
        while (true) {
            fila = rand.nextInt(3) + 1;  // Fila entre 1 y 3
            col = rand.nextInt(3) + 1;  // Columna entre 1 y 3
            if (tablero[fila][col] == ' ') {
                tablero[fila][col] = jugador;
                break;
            }
        }
    }

    // Método para verificar si hay un ganador
    public static boolean esGanador(char jugador) {
        // Comprobar filas, columnas y diagonales
        for (int i = 1; i <= 3; i++) {
            if ((tablero[i][1] == jugador && tablero[i][2] == jugador && tablero[i][3] == jugador) ||
                (tablero[1][i] == jugador && tablero[2][i] == jugador && tablero[3][i] == jugador)) {
                return true;
            }
        }
        if ((tablero[1][1] == jugador && tablero[2][2] == jugador && tablero[3][3] == jugador) ||
            (tablero[1][3] == jugador && tablero[2][2] == jugador && tablero[3][1] == jugador)) {
            return true;
        }
        return false;
    }

    // Método para verificar si hay un empate
    public static boolean esEmpate() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
