import java.util.Arrays;

public class EjercicioUnoB {

    public static void ejercicioUnoB(int[] arr){
        int duplicado = 0, faltante = 0;

        for(int i = 0; i < arr.length; i++){
            int valor = arr[i]<0 ? -arr[i]: arr[i];

            int indice = valor ;

            if(arr[indice] > 0){
                arr[indice] = -arr[indice];
            }else{
                duplicado = indice;
            }
        }
        System.out.println("El número duplicado es: "+duplicado);
    }

   
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 0, 3, 7, 2, 4};
        ejercicioUnoB(arr);
    }
}
