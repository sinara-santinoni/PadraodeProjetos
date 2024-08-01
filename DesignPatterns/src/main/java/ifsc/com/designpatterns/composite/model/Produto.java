/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsc.com.designpatterns.composite.model;

import ifsc.com.designpatterns.composite.interfaces.Component;
import java.math.BigDecimal;

/**
 *
 * @author aluno
 */
public class Produto implements Component {

    public String nome;
    
    public Double valor;

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    
    @Override
    public Double execute() {
        return valor;
    }
    
}
