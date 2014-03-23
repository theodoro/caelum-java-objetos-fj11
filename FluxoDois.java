/*Adicionando "E" e "OU" no controle de fluxo*/

public class FluxoDois{

    public static void main(String[] args){

        int idade = 15;
        boolean amigoDoDono = true;
/*Embora minha idade seja menor que 18
 * Usando a operador "OU" consegui entrar
 * pois sou amigo do dono*/
        if(idade >= 18 || amigoDoDono == true){

            System.out.println("Pode Entrar");

        }else{

            System.out.println("Não pode Entrar!");
        }
    }
}
