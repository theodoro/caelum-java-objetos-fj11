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
public class Carro {
    
   public String cor;
   public String modelo;
   public double velocidadeAtual;
   public double velocidadeMax;
   public Motor motor;
    
    
    public void ligar(){
        System.out.println("O Carro esta ligado!");
        
    }
    
    public void acelera(double qtde){
        double novaVelocidade = this.velocidadeAtual + qtde;
        this.velocidadeAtual = novaVelocidade;
    }
    
    public int getMarcha(){
        if(this.velocidadeAtual < 0){
            return -1;
        }if(this.velocidadeAtual >= 0 && this.velocidadeAtual < 40){
            return 1;
        }if(this.velocidadeAtual >= 40 && this.velocidadeAtual < 80){
            return 2;
        }else{
            return 3;
        }
    }
    
}
