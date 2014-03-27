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
public class Cliente {
    
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    
    public Cliente(){
        
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    public Long getId(){
        return this.id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void getDetalhe(){
        System.out.println("ID :" + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Email :" + getEmail());
        System.out.println("CPF :" + getCpf());
    }
}
