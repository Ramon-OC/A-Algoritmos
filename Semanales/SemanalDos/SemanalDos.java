import java.util.Arrays;
public class SemanalDos{
    static int operaciones = 0;
    public static void juego(int[] jugadores, boolean ultimoMataPrimero){
        int largo = jugadores.length;
        if(jugadores.length == 1){
            System.out.println("¡El jugador sobreviviente es: "+jugadores[0]+"!\nCon "+operaciones+" operaciones.");

            return;
        }else{
            if(largo%2==0){
                int[] sobrevivientes = new int[(largo/2)];
                int valorDeInicio = ultimoMataPrimero ? 1 : 0;
                for(int i = 0, j = valorDeInicio; i < sobrevivientes.length && j < largo; i++, j=j+2){
                    sobrevivientes[i] = jugadores[j];
                    operaciones++;
                }
                System.out.println(Arrays.toString(sobrevivientes));
                boolean ump = sobrevivientes[sobrevivientes.length-1]==jugadores[jugadores.length-1] ? true : false;
                juego(sobrevivientes, ump);
            }else{ 
                int[] sobrevivientes = ultimoMataPrimero ?  new int[(largo/2)] : new int[(largo/2)+1];
                int valorDeInicio = ultimoMataPrimero ? 1 : 0;
                for(int i = 0, j = valorDeInicio; i < sobrevivientes.length && j < largo; i++, j=j+2){
                    sobrevivientes[i] = jugadores[j];
                    operaciones++;
                }
                System.out.println(Arrays.toString(sobrevivientes));
                boolean ump = sobrevivientes[sobrevivientes.length-1]==jugadores[jugadores.length-1] ? true : false;
                juego(sobrevivientes, ump);
            }
        }
    }
    public static void main(String[] args) {
        int n = 100;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (i+1);
        }
        juego(arr, false);
    }
}