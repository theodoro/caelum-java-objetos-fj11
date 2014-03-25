/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teste;

import entidade.Conta;

/**
 *
 * @author brunoaquino
 */
public class TesteReferenciaObj {
    
    public static void main(String[] args){
        
        Conta c1 = new Conta();
        c1.deposita(100);
        
        Conta c2 = c1; // Linha importante
        
        c2.deposita(200);
        
        System.out.println(c1);
        System.out.println(c2);
    }
    
}
