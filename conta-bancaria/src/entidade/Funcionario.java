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
public class Funcionario {
    
    public String nome;
    public String departamento;
    public double salario;
    public String data;
    public String rg;
    
    public void aumentaSalario(double quantidade){
        if(this.salario < 1500){
            double novoSalario = (this.salario * 10) / 100;
            this.salario = novoSalario;
        }else{
            double novoSalario = (this.salario * 5) /100;
            this.salario = novoSalario;
        }
    }
    
    public double calculaGanhoAnual(){
        double ganhoAnual = this.salario * 12;
        
        return ganhoAnual;
    }
    
}
