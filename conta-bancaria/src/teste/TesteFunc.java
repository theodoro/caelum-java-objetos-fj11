/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teste;

import entidade.Funcionario;

/**
 *
 * @author brunoaquino
 */
public class TesteFunc {
    
    public static void main(String[] args){
        
        Funcionario fun = new Funcionario();
        
        fun.nome = "Bruno";
        fun.departamento = "Implantação";
        fun.salario = 1500;
        fun.data = "01/07/2013";
        
        fun.aumentaSalario(100);
        
        fun.calculaGanhoAnual();
    }
    
}
