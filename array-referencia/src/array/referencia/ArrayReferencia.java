/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array.referencia;

/**
 *
 * @author brunoaquino
 */
public class ArrayReferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Conta [] minhasContas;
      minhasContas = new Conta[10];
      Conta nova = new Conta();
      
      nova.setNumeroConta(Long.valueOf(100));
      nova.setDono("Bruno");
      
      minhasContas[0] = nova;
    }
    
}
