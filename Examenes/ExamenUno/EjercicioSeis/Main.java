import java.util.Stack;
import java.util.Iterator;

public class Main{
    private class A{
        public String toString(){
            return "A";
        }
        }
    
    private class B{
        @Override public String toString(){
            return "B";
        }
    }
    
    static Main m = new Main();
    
    public static void main(String[] args){
        m.ejecucion();
    }
    
    public void ejecucion(){
        Stack<Tipo> a = new Stack<>();
        Stack<Tipo> b = new Stack<>();
        a.push(new Tipo('A'));
        a.push(new Tipo('A'));
        a.push(new Tipo('B'));
        a.push(new Tipo('A'));
        a.push(new Tipo('B'));
        a.push(new Tipo('B'));
        a.push(new Tipo('B'));
        a.push(new Tipo('A'));
        
        b.push(new Tipo('A'));
        b.push(new Tipo('B'));
        b.push(new Tipo('B'));
        b.push(new Tipo('A'));
        b.push(new Tipo('B'));
        b.push(new Tipo('B'));
        b.push(new Tipo('A'));
        b.push(new Tipo('B'));
        
        Iterator<Tipo> iterA = a.iterator();
        Iterator<Tipo> iterB = b.iterator();
        System.out.print("Pila a antes del algoritmo:\n");
        while(iterA.hasNext())
            System.out.print(iterA.next());
        System.out.print("\nPila b antes del algoritmo:\n");        
        while(iterB.hasNext())
            System.out.print(iterB.next());
        
        Algoritmo.algRecursivo(a,b);
        
        iterA = a.iterator();
        iterB = b.iterator();
        System.out.print("\nPila a despues del algoritmo:\n");
        while(iterA.hasNext())
            System.out.print(iterA.next());
        System.out.print("\nPila b despues del algoritmo:\n");        
        while(iterB.hasNext())
            System.out.print(iterB.next());
    }
}    