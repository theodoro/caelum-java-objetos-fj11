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
public class Pessoa {
   
    private String nome;
    private int idade;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void fazAniversario(){
        this.idade = this.idade + 1;
    }
    
    public int getAniversaio(int anos){
        int novaIdade = this.idade + anos;
        return this.idade = novaIdade;
    }
    
    
}
