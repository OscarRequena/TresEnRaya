package gestionUsuario;

import input.Input;
import output.Output;

public class GestionHumano {
    public static boolean humanoJuega = true;

    public static boolean cambioTurno(){
        return humanoJuega = !humanoJuega;
    }

    public static int ingresarCoordenada(boolean comprobacionUsuario){
        int Coordenada;
        if (comprobacionUsuario){
            Output.ingreseLaCoordenada();
            Coordenada = Input.recibirCoordenada();
        }else{
            Coordenada = (int)(Math.random() * 3);
        }
        return Coordenada;
    }

}
