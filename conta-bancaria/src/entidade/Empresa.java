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
public class Empresa {

    private String nome;
    private String cnpj;
    private Funcionario[] empregados;

    public Empresa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Funcionario[] getEmpregados() {
        return empregados;
    }

    public void setEmpregados(Funcionario[] empregados) {
        this.empregados = empregados;
    }

    
    public void adiciona(Funcionario f) {

        for (int i = 0; i < empregados.length; i++) {
            this.empregados[i] = f;
        }
    }
    
    public void mostra(){
        for(int i = 0; i < this.empregados.length; i++){
            System.out.println(empregados[i].nome);
        }
    }

}
