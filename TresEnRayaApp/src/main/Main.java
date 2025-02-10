package main;

import gestionTablero.GestionTablero;
import gestionUsuario.GestionHumano;
import input.Input;
import output.Output;
import validador.Validar;

import java.util.Random;

import static gestionTablero.GestionTablero.michi;
import static gestionTablero.GestionTablero.mostrarTablero;

public class Main {
    public static int coordenada1;
    public static int coordenada2;
    public static int contadorDeJuegadas = 0;
    public static boolean turnoJugador = GestionHumano.humanoJuega;

    public static void main(String[] args) {
        inicializarTablero();
        mostrarTablero();
        boolean esFinDelJuego;
        do {
            boolean incorrectaValidacionCoordenadas;
            do {
                incorrectaValidacionCoordenadas = esIncorrectaValidacionCoordenadas();
            }while(incorrectaValidacionCoordenadas);
            esFinDelJuego = juegaTresEnRaya();
        }while(!esFinDelJuego);
    }

    private static boolean juegaTresEnRaya() {
        boolean esFinDelJuego;
        ingresarFicha(coordenada1,coordenada2);
        mostrarTablero();
        turnoJugador = cambioDeTurno();
        contadorDeJuegadas++;
        esFinDelJuego = finDelJuego(contadorDeJuegadas);
        return esFinDelJuego;
    }

    private static boolean esIncorrectaValidacionCoordenadas() {
        boolean incorrectaValidacionCoordenadas;
        coordenada1 = ingresarCoordenada(turnoJugador);
        coordenada2 = ingresarCoordenada(turnoJugador);
        incorrectaValidacionCoordenadas = !validarCoordenadas(coordenada1,coordenada2);
        if (incorrectaValidacionCoordenadas){
           if (turnoJugador){
               Output.coordenadaErronea();
           }
        }
        return incorrectaValidacionCoordenadas;
    }

    public static void inicializarTablero(){
        GestionTablero.inicializarTablero();
    }
    public static int ingresarCoordenada(boolean comprobacionUsuario){return GestionHumano.ingresarCoordenada(comprobacionUsuario);}
    public static boolean validarCoordenadas(int fila, int columna){return GestionTablero.ValidarTablero(fila, columna);}
    public static void ingresarFicha(int coordenada1, int coordenada2){GestionTablero.insertarTablero(coordenada1,coordenada2);}
    public static boolean cambioDeTurno(){
        return GestionHumano.cambioTurno();
    }
    public static boolean finDelJuego(int contadorDeJuegadas){
        return GestionTablero.finDelJuego(contadorDeJuegadas);
    }
}
