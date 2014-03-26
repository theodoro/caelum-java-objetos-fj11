/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package start;

import entidade.Carro;

/**
 *
 * @author brunoaquino
 */
public class Programa {
    
    public static void main(String[] args){
        
        Carro fusca = new Carro();
        
        fusca.cor = "Preto";
        fusca.modelo = "1600";
        fusca.velocidadeAtual = 50;
        fusca.velocidadeMax = 100;
        fusca.motor.tipo = "AP";
        fusca.motor.potencia = 1600;
        
        fusca.ligar();
        
        fusca.acelera(90);
        
        fusca.getMarcha();
        
        System.out.println(fusca.velocidadeAtual);
    }
    
}
