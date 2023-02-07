import java.io.ObjectInputFilter.Status;
import java.util.Arrays;


public class SemanalDos{

    static int indiceArma = 0, largo = 0, porEliminar = 0, eliminados = 0,auxA = 1;
    static int medición = 0;

    static public void reto(int arr[],int inicio){
        largo = arr.length-1; // 100
        indiceArma = inicio; // 0 - 2 - - -
    

        porEliminar = indiceArma+auxA; // 1 - 3
        indiceArma = porEliminar+auxA; // 2 - 
    
        if( porEliminar > largo ){
            porEliminar = ((porEliminar)-largo)-1;
            auxA++;

        }

        if( indiceArma > largo ){
            indiceArma = ((indiceArma)-largo)-1;
            auxA++;

        }

        //indiceArma = indiceArma >= largo ? (largo)-indiceArma : porEliminar;

        arr[porEliminar] = 0;
        eliminados++;

        //System.out.println(Arrays.toString(arr)+" porEliminar: "+porEliminar+" pues >= "+largo+" da"+(largo-porEliminar));
        System.out.println(" - Aquí está el arma: "+indiceArma+" y el eliminado fue: "+porEliminar+Arrays.toString(arr)+". AuxA:"+auxA+" y AuxE: "+auxA);


        if(eliminados!=largo){
            medición++;
            reto(arr,indiceArma);
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = 1;
        }
        reto(arr, 0);
        System.out.println("¡Con un total de "+medición+" iteraciones!");
    }
}