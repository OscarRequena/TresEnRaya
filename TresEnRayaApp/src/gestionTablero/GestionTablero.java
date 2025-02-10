package gestionTablero;

import gestionUsuario.GestionHumano;
import output.Output;
import validador.Validar;

public class GestionTablero {
    public static char[][] michi;
    public static void inicializarTablero(){
        michi = new char[3][3];
        for (int i = 0 ; i < michi.length;i++){
            for (int j = 0; j < michi[i].length;j++){
                michi[i][j]= '-';
            }
        }
    }
    public static void mostrarTablero(){
        Output.ImprimirTablero(michi);
    }
    public static boolean ValidarTablero(int fila, int columna){
        return Validar.validarCoordenadas(fila,columna,michi);
    }
    public static void insertarTablero(int coordenada1, int coordenada2){
        if (GestionHumano.humanoJuega){
            michi[coordenada1][coordenada2]= 'X';
        }else {
            michi[coordenada1][coordenada2]= 'O';
        }
    }

    public static boolean finDelJuego(int contadorDeJugadas){
        return Validar.finDelJuego(contadorDeJugadas);
    }

}
