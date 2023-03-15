public class Tipo{
    private char tipo;
    
    public Tipo(char tipo){
        this.tipo = tipo;
    }    
    
    public char getTipo(){
        return tipo;
    }
    
    @Override public String toString(){
        return String.valueOf(getTipo());
    }
}