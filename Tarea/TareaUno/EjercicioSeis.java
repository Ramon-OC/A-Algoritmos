import java.util.Arrays;

public class EjercicioSeis{
	public static int[] eindiceAuxercicioCinco(int arr[]){
		for(int i = 1; i < arr.length; ++i){	
			int actual = arr[i], indiceAux = i-1;
			while (indiceAux >= 0 && arr[indiceAux] > actual){
				arr[indiceAux+1] = arr[indiceAux];
				indiceAux = indiceAux - 1; // Se modifica el índice
			}
		arr[indiceAux+1] = actual;
		}
		return arr;
		}
	public static void main(String args[]){
		int arr[] = { 10, 4 , 6, 7 , 2 , 1 , 87, 3};
		System.out.println(Arrays.toString(eindiceAuxercicioCinco(arr)));
	}
}