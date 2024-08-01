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
public class Trabalhador extends Pessoa {
    
    private int empresaId;

    public Trabalhador(int empresaId, String nome, String sexo) {
        super(nome, sexo);
        this.empresaId = empresaId;
    }

    public int getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(int empresaId) {
        this.empresaId = empresaId;
    }
    
    @Override
    public void trabalha() {
        if (empresaId == 0) {
            System.out.println("Não está trabalhando.");
        } else {
            System.out.println("Está trabalhando.");
        }
    }
    
}
