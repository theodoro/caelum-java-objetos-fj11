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
public class Conta {
    
    int numero;
    Cliente titular;
    double saldo;
    double limite;
    
    public void saca(double valor){
        double novoSaldo = this.saldo - valor;
        this.saldo = novoSaldo;
    }
    
    public boolean sacaNovo(double valor){
        if(this.saldo < valor){
            System.out.println("Saldo insuficiente: " + this.saldo);
            return false;
        }else{
            System.out.println("Saque realizado com sucesso!");
            this.saldo -= valor;
            return true;
        }
    }
    public void deposita(double valor){
        double novoValor = this.saldo + valor;
        this.saldo = novoValor;
    }
    
    public boolean tranfere(Conta destino, double valor){
        boolean retirou = this.sacaNovo(valor);
        return retirou != false;
    }
    
    
    
}
