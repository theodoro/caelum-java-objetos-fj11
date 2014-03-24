/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidade;

/**
 *
 * @author brunoaquino
 */
public class Programa {
    
    public static void main(String[] args){
        
        Conta conta = new Conta();
        
        conta.nome = "Bruno Aquino";
       /* 
        conta.saldo = 0.00;
        System.out.println("Saldo da minha conta: " + conta.saldo);
        System.out.println("Deposito de 1500");
        conta.deposita(1500);
        System.out.println("Saque de 500");
        conta.saca(500);
        
        System.out.println("Novo Saldo :" + conta.saldo);*/
        
        conta.saldo = 1500;
        
       // System.out.println("Saldo da minha conta: " + conta.saldo);
        
        conta.sacaNovo(2000);
        
    
        
       
    }
    
}
