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
    String nome;
    double saldo;
    double limite;
    
    public void saca(double valor){
        double novoSaldo = this.saldo - valor;
        this.saldo = novoSaldo;
    }
    
    public void deposita(double valor){
        double novoValor = this.saldo + valor;
        this.saldo = novoValor;
    }
    
    
    
}
