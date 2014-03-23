/*O For tem a mesma ideia do while, porém com as informações mais 
 * agrupadas, deixando o código mais legivel*/

public class FluxoFor{

    public static void main(String[] args){

        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        /*Note que o while abaixo, é a mesma coisa*/
        System.out.println("Aqui começa o while");
        int j = 0;
        while(j < 10){
            System.out.println(j);
            j++;
        }
    }
}
