import java.util.Arrays;

public class EjercicioUnoB {

    public static void ejercicioUnoB(int[] arr){
        int duplicado = 0, faltante = 0;
        int sumaCompleta = 0, sumaIncompleta = 0;

        for(int i = 0; i < arr.length; i++){
            sumaCompleta += i;
            int valor = arr[i]<0 ? -arr[i]: arr[i];

            sumaIncompleta += valor;

            int indice = valor ;

            if(arr[indice] > 0){
                arr[indice] = -arr[indice];
            }else{
                duplicado = indice;
            }
        }
        
        faltante = sumaCompleta - (sumaIncompleta - duplicado);
        System.out.println("El número duplicado es: "+duplicado);
        System.out.println("El número faltante es: "+faltante);


    }

   
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 0, 3, 7, 2, 4};
        ejercicioUnoB(arr);
    }
}
