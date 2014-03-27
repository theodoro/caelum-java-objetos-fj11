/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package faz.aniversario;

/**
 *
 * @author brunoaquino
 */
public class FazAniversario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pessoa jovem = new Pessoa();
        
        jovem.setNome("Bruno");
        jovem.setIdade(27);
        
        System.out.println("Nome: " + jovem.getNome() + "-" + "Idade :" + jovem.getIdade());
        
        jovem.getAniversaio(5);
        
        System.out.println("Nome: " + jovem.getNome() + "-" + "Idade :" + jovem.getIdade());
    }
    
}
