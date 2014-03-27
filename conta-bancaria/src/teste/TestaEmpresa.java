/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teste;

import entidade.Empresa;
import entidade.Funcionario;

/**
 *
 * @author brunoaquino
 */
public class TestaEmpresa {
    
   public static void main(String[] args){
       
       Empresa empresa = new Empresa();
       
       empresa.setEmpregados(new Funcionario[10]);
       
       Funcionario func = new Funcionario();
       func.nome = "Bruno";
       func.departamento = "Implantação";
       func.rg = "00000000";
       func.data = "25/04/1986";
       func.salario = 1500.00;
       
       empresa.adiciona(func);
       
       empresa.mostra();
   }
    
}
