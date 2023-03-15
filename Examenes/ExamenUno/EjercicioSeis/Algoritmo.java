import java.util.Stack;

public class Algoritmo{
    public static void algRecursivo(Stack<Tipo> a, Stack<Tipo> b){
        Stack<Tipo> s = new Stack<>();
        repartirA(a,b,s);
        pasarBaA(a,b,s);
        repartirA(a,b,s);
        pasarSaA(a,b,s);
    }
    
    public static void repartirA(Stack<Tipo> a, Stack<Tipo> b, Stack<Tipo> s){
        if (a.empty())
            return;
        if(a.peek().getTipo() == 'A')
        s.push(a.pop());
        else
        b.push(a.pop());
        repartirA(a,b,s);
    }
    
    public static void pasarBaA(Stack<Tipo> a, Stack<Tipo> b, Stack<Tipo> s){
        if (b.empty())
            return;
        a.push(b.pop());
        pasarBaA(a,b,s);
    }
    
    public static void pasarSaA(Stack<Tipo> a, Stack<Tipo> b, Stack<Tipo> s){
        if (s.empty())
            return;
        a.push(s.pop());
        pasarSaA(a,b,s);
    }
}



