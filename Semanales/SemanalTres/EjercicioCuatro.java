import java.util.Arrays;

public class EjercicioCuatro {

    public static void ejercicioCuatro(int[] arr){
        int elementoRepetido = -1, cantidadFaltantes = 0, cantidadRepetidos = 0;

        for(int i = 0; i < arr.length; i++){
            int a = arr[i];
            if(a < 0){
             a = -(a)-1;
            }

            if(arr[a]>=0){
                arr[a] = -(arr[a]+1);
            }else{
                elementoRepetido = a;
                if(arr[a] != -arr.length){
                    cantidadRepetidos++;
                    arr[a] = -arr.length;
                }
                cantidadFaltantes++;
            }   
        }

        int[] repetidos = new int[cantidadRepetidos]; // Espacio extra de los números repetidos
        int[] faltantes = new int[cantidadFaltantes]; // Espacio extra de los números faltantes
       
        for(int i = 0, j = 0, k = 0; i < arr.length; i++){
        
            if(arr[i] == -(arr.length)){
                repetidos[k] = i;
                k++;
            }

            if(arr[i] >= 0){
                faltantes[j] = i;
                j++;
            }
        }

        System.out.println("Cantidad de números repetidos: "+cantidadRepetidos);
        System.out.println("Números repetidos: "+Arrays.toString(repetidos));
        System.out.println("Números faltantes: "+Arrays.toString(faltantes));
    }       

    public static void main(String[] args) {
        int[] arr = {2,3,5,4,0,1,5,5,7,6};
        int[] arry = {1,1,1,1,2,2,2,2,3,3,4,4};
        ejercicioCuatro(arry);
    }

}
