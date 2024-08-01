/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsc.com.designpatterns.shape.model;

/**
 *
 * @author aluno
 */
public abstract class Pessoa {
    
    private String nome;
    private String sexo;

    public Pessoa(final String nome, final String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void alteraNome(final String nome) {
        this.nome = nome;
    }
    
    public abstract void trabalha();
}
