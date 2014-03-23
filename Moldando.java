/*
 * Vamos usar casted para moldar as variaveis
 * Por exemplo, vamos fazer um variavale double
 * ser atribuida a um inteiro, arredondando seu valor*/

public class Moldando {
    
    public static void main(String[] args){
        
        double pi = 3.14;

        System.out.println("Valor REAL da variavel: " + pi);

        /*
         * Usando o casted para arredondar para inteiro*/

        int novoPi = (int) pi;

        System.out.println("Valor arredondado: " + novoPi);


    }
}
