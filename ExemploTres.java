/*Imprimir todos os múltiplos de 3 entre 1 e 1000*/
public class ExemploTres{

    public static void main(String[] args){

        for(int i = 1; i <= 1000; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
