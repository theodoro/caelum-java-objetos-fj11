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
        
        Cliente cli = new Cliente();
        
       conta.titular = cli;
        
        
        
        conta.titular.nome = "Priscila";
        System.out.println(conta.titular.nome);
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
        
        conta.sacaNovo(500);
        
        Conta c2 = new Conta();
        conta.tranfere(c2, 3000);
    
        
       
    }
    
}
