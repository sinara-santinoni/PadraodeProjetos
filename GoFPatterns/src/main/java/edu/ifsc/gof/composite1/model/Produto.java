package edu.ifsc.gof.composite1.model;

import edu.ifsc.gof.composite1.interfaces.Component;

public class Produto implements Component {
    private double valor;
    private String nome;

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto(double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    @Override
    public double execute() {
        return getValor();
    }
    
    
}
