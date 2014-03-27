/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package start;

import entidade.Cliente;

/**
 *
 * @author brunoaquino
 */
public class Start {
    
    public static void main(String[] args){
        
        Cliente novoCli = new Cliente();
        
        novoCli.setId(Long.valueOf(1000));
        /*
        A linha abaixo, faz o mesmo da linha de cima
        */
        //novoCli.setId((long) 2000);
        novoCli.setNome("Bruno");
        novoCli.setCpf("000.000.000-98");
        novoCli.setEmail("bruno@gmail.com");
        
        novoCli.getDetalhe();
    }
}
