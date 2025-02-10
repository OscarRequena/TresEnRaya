package output;

public class Output {

    public static void ImprimirTablero(char[][] michi){
        for (int i = 0 ; i < michi.length;i++){
            for (int j = 0; j < michi[i].length;j++){
                System.out.print(michi[i][j]);
            }
            System.out.println();
        }
    }

    public static void ingreseLaCoordenada(){
        System.out.println("Ingrese la coordenada: ");
    }

    public static void coordenadaErronea(){
        System.err.println("Las coordenadas ingresadas están ocupadas");
    }
}
