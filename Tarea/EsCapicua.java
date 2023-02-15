public class EsCapicua{

    public static boolean esCapicua(String a){
        for(int i = 0, large = a.length(); i  <= 4; i++, large--){
            if(i == 2 ){
                i++;
            }
            if(a.charAt(i) != a.charAt(large-1)){
                System.out.println(a+" no es una fecha capicúa.");
                return false;
            }
        }
        System.out.println(a+" sí es una fecha capicúa.");
        return true;
    }

    public static void main(String[] args) {
        // Fechas que son capicúas.
        esCapicua("02-02-2020");
        esCapicua("13-02-2031");
        esCapicua("23-02-2032");
        esCapicua("04-02-2040");

        // Fechas que no son capicúas.
        esCapicua("23-02-2031");
        esCapicua("15-02-2023");
        esCapicua("17-08-2002");
    }
}