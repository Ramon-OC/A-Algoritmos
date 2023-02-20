import java.util.Arrays;
public class EjercicioTres {
    public static void ejercicioTres(int[] arr){
        int elementoRepetido = -1, cantidadFaltantes = 0;
        for(int i = 0; i < arr.length; i++){
            int a = arr[i];
            if(a < 0){
             a = -(a)-1;
            }
            if(arr[a]>=0){
                arr[a] = -(arr[a]+1);
            }else{
                elementoRepetido = a;
                cantidadFaltantes++;
            }   
        }

        int[] faltantes = new int[cantidadFaltantes]; // Espacio extra de los números faltantes
        for(int i = 0, j = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                faltantes[j] = i;
                j++;
            }
        }
        System.out.println("Número repetido: "+elementoRepetido);
        System.out.println("Números faltantes: "+Arrays.toString(faltantes));
    }       

    public static void main(String[] args) {
        int[] arr = {2,3,5,4,0,1,5,5,7,6};
        int[] arry = {2,7,7,7,7,7,7,7};
        ejercicioTres(arr);
    }
}
