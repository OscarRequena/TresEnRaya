package validador;


public class Validar {
    public static boolean validarCoordenadas(int fila, int columna, char[][] tablero){
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == '-';
    }

    public  static boolean finDelJuego(int contadorJugadas) {
        return contadorJugadas == 9;
    }


}
