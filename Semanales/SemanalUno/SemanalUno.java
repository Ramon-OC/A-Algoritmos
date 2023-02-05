import java.util.Arrays;

public class SemanalUno{
    static int usoBalanza = 0;
    static boolean balanzaEquilibrada = false; /* Permite saber si ambos extremos pesan lo mismo para así tomar la perla sobrante.*/

    /**
     * Se encarga de particionar un arreglo de números y regresa el que tenga un menor peso simulando una balanza
     * @param perlas arreglo con un número diferente al resto (perla falsa)
     * @return número de menor valor (perla con peso inferior)
     */
    public static int medir(int perlas[]){
        int largo = perlas.length;
        int[] conjuntoFalso;
        switch (largo){ // Caso base
            case 1: // El arreglo solo tiene un elemento, se trata de la perla falsa
                System.out.println("\nLa balanza se usó: "+usoBalanza+" veces");
                return perlas[0];
            case 2: // Se hace una última medición, se regresa el número de menor valor 
                System.out.println("Caso dos, elemento 0: "+ perlas[0]+", elemento 1: "+perlas[1]+".");
                usoBalanza++;
                System.out.println("\nLa balanza se usó: "+usoBalanza+" veces");
                return perlas[0] > perlas[1] ? perlas[1] : perlas[0]; 
            case 3: // Para disminuir el número de veces que usamos la balanza, separamos una perla del arreglo y hacemos la medición con el resto
                 // No podemos usar solo el arreglo por la definción de balanza
                int[] primerGrupo = Arrays.copyOfRange(perlas, 0, 0);
                int[] segundoGrupo = Arrays.copyOfRange(perlas, 1, 1); 
                conjuntoFalso = balanza(primerGrupo,segundoGrupo);
                System.out.println("Caso tres\n - primerGrupo: "+ Arrays.toString(primerGrupo)+"\n - segundoGrupo:"+ Arrays.toString(segundoGrupo)+" - perlaSeparada: "+perlas[2]);
                System.out.println("\nLa balanza se usó: "+usoBalanza+" veces"); 
                return balanzaEquilibrada ? perlas[2] : conjuntoFalso[0]; 
        }

        if (largo % 2 == 0) { // Si el número de perlas en el arreglo es par
            int mitad = largo / 2;
            int[] primerGrupo = Arrays.copyOfRange(perlas, 0, mitad);
            int[] segundoGrupo = Arrays.copyOfRange(perlas, mitad, largo);
            System.out.println("n es par\n - primerGrupo: "+ Arrays.toString(primerGrupo)+"\n - segundoGrupo:"+ Arrays.toString(segundoGrupo));
            return medir(balanza(primerGrupo, segundoGrupo));
        } else { // Si el número de perlas es impar
            int mitad = (largo - 1) / 2, perlaLibre = perlas[largo-1];

            int[] primerGrupo = Arrays.copyOfRange(perlas, 0, mitad);
            int[] segundoGrupo = Arrays.copyOfRange(perlas, mitad, largo-1);    

            System.out.println("n es impar\n - primerGrupo: "+ Arrays.toString(primerGrupo)+"\n - segundoGrupo:"+ Arrays.toString(segundoGrupo)+"\n - perlaSeparada: "+perlaLibre);
            int[] platoLigero = balanza(primerGrupo,segundoGrupo);
            return balanzaEquilibrada ? perlaLibre : medir(platoLigero);
        }

    }

    // Devuelve la lista cuya suma de elementos sea menor.
    public static int[] balanza(int grupoA[], int grupoB[]){
        usoBalanza++;
        int sumaGrupoA =  Arrays.stream(grupoA).sum(), sumaGrupoB =  Arrays.stream(grupoB).sum();
        if(sumaGrupoA == sumaGrupoB){
            balanzaEquilibrada = true;
        }else{
            balanzaEquilibrada = false;
        }
        int[] aux = sumaGrupoA > sumaGrupoB ? grupoB : grupoA;
        System.out.println("balanzaEquilibrada: "+balanzaEquilibrada+", el grupo más ligero es: "+Arrays.toString(aux)+"\n");
        return aux;
    }

    public static void main(String[] args) {
        int[] arr = new int[1234];
        for (int i = 0; i < 1234; i++) {
            arr[i] = 2;
        }
        arr[89] = 1; // Por las risas jsjs

        int perlas[] = {2,1,2,2,2,2,2,2,2,2}; //8
        System.out.println("La perla falsa es: "+medir(arr));        

    }
}