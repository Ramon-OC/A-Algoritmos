import java.util.Arrays;

class SemanalDosE2 {

    public static int juego(int[] jugadores, int conArma){
        int n = jugadores.length;
        int siguienteRonda[] = new int[(n/2)];
        int a = conArma;
        int numeroMuertos = 0;
        int aux = 0;
        if(jugadores.length == 1){ // Caso base
            return jugadores[0];
        }
        for(int i = 0; numeroMuertos != siguienteRonda.length; i++){
            if(a+2 > jugadores.length-1){
                a = (jugadores.length-1) - (a) == 1 ? 0 : 1;
            }else{
                a = a+2;
            }
            siguienteRonda[i] = jugadores[a];
            numeroMuertos++; 
            aux = i;          
        }
        System.out.println(Arrays.toString(siguienteRonda));
        juego(siguienteRonda, aux);
        return -1;
    
    }

public static void main (String[] args) {
    int n = 5;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (i+1);
        }
    System.out.println(Arrays.toString(arr));
    juego(arr,1);
}
}
