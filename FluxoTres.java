/*Usando o operador "E" a condição do if só será verdadeira
 * se as duas condições forem verdadeiras*/

public class FluxoTres{

    public static void main(String[] args){

        int idade = 18;
        boolean pagouEntrada = false;

        if(idade >= 18 && pagouEntrada == true){
            System.out.println("Pode Entrar!");
        }else{
            System.out.println("Não pode entrar!");
        }
    }
}
