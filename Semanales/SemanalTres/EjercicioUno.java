public class EjercicioUno{
    
    static public void ejercicioUno(int arr[]){
        int suma = 0, real = 0, duplicado = -1; 
        int[] espacioExtra = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            suma += arr[i];
            real += i; 
            if(espacioExtra[arr[i]] == 0)
                espacioExtra[arr[i]] = arr[i]+1; 
            else
                duplicado = arr[i];
        }

        int faltante = real - (suma - duplicado);
        System.out.println("El número que falta es: "+faltante);         
        System.out.println("El número duplicado  es: "+duplicado); 
    }

    public static void main(String[] args) {
        int[] prueba = {7,1,5,0,3,4,7,2};
        ejercicioUno(prueba);
    }
}