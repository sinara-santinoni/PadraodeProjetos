package edu.ifsc.gof.composite2.model;

import edu.ifsc.gof.composite2.interfaces.Membro;

public class Funcionario implements Membro {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    @Override
    public double calculaCusto() {
        return salario;
    }

    @Override
    public String identificacao() {
        return cargo + ":" + nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
