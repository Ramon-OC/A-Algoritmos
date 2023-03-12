import java.util.Stack;
public class Cinco{
    public static void ordenaPilas(Stack<Integer> pilaUno, Stack<Integer> pilaDos) {
        
        int[] extra = new int[1]; // Espacio Extra
        int retirados = 0; 
        
        // Proceso para retirar elementos de tipo B en la pila uno
        while (!pilaUno.isEmpty()) {
            if(pilaUno.peek() == 1){ 
                pilaDos.push(pilaUno.pop());
                retirados++; 
            }else if (pilaUno.peek() == 0){               
                extra[0] = pilaUno.pop();
                while(retirados > 0){ 
                    pilaUno.push(pilaDos.pop());
                    retirados--;
                }
                pilaDos.push(extra[0]);
            }
        }

        // Los ultimos elementos de la pila dos con ayuda de “retirados"
        while(retirados > 0){
            pilaUno.push(pilaDos.pop());
            retirados--;
        }

        // Proceso de retirar elementos de tipo A de la pila 1
        while (!pilaDos.isEmpty()) {
            if(pilaDos.peek() == 0){
                pilaUno.push(pilaDos.pop()); 
                retirados++; 
            }else if (pilaDos.peek() == 1){               
                extra[0] = pilaDos.pop(); 
                while (retirados > 0){ 
                    pilaDos.push(pilaUno.pop());
                    retirados--;
                }
                pilaUno.push(extra[0]);
            }
        }

        // Los ultimos elementos de la pila uno con ayuda de “retirados"
        while(retirados > 0){
            pilaDos.push(pilaUno.pop());
            retirados--;
        }
        
        // Mostrar los elementos en cada pila
        System.out.println("Elementos ordenados en la pila 1: "+pilaUno);
        System.out.println("Elementos ordenados en la pila 2: "+pilaDos);
    }

    public static void main(String[] args) {
        Stack<Integer> pilaUno = new Stack<>();
        Stack<Integer> pilaDos = new Stack<>();
        int n = 6; // Seis elementos por pila

        for (int i = 0; i < n; i++) {
            int elementopilaUno = (int) (Math.random() * 2); // A y B como 1 y 0
            int elementopilaDos = (int) (Math.random() * 2);
            pilaUno.push(elementopilaUno);
            pilaDos.push(elementopilaDos);
        }
    
        // Mostrar los elementos en cada pila antes de dividirlas
        System.out.println("Elementos en la pila 1: "+pilaUno);
        System.out.println("Elementos en la pila 2: "+pilaDos);
        ordenaPilas(pilaUno, pilaDos);
    }
}