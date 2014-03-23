/*Juntar 300 reais por mês até final de 2016*/

public class Poupanca{
    public static void main(String[] args){

        double valor = 300;
        int ano =  2014;

        while(ano < 2017){

            double valorAnual = valor * 12;
            System.out.println("Valor anual : " + valorAnual);
            ano = ano + 1;
        }
    }
}
