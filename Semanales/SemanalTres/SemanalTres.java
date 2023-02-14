import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

public class SemanalTres{

    // Definimos la lista ligada con los n elementos


    static public void semanalTres(int arr[]){
        
        int r = 0, p = 0;

        
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        for(int i = 0; i < arr.length; i++){
            if(numbers.contains(arr[i])){
                numbers.remove(Integer.valueOf(arr[i]));
            }else{
                r = arr[i];
            }
        }
        
        p = numbers.getFirst(); // Si hay elemento repetido, implica que quedará uno sin remover.
        System.out.println("r: "+r+"p: "+p);
    }

    public static void main(String[] args) {
        int[] prueba = {7,1,5,0,3,4,7,2};
        semanalTres(prueba);
    }
}