package edu.ifsc.gof.composite2.model;

import edu.ifsc.gof.composite2.interfaces.Membro;
import java.util.ArrayList;
import java.util.List;

public class Setor implements Membro {
    private String nome;

    private List<Membro> setores = new ArrayList<Membro>();

    public Setor(String nome) {
        this.nome = nome;
    }
    
    @Override
    public double calculaCusto() {
        double total = 0;
        for(Membro i:setores) {
	    total += i.calculaCusto();
	}
        return total;
    }
    
    @Override
    public String identificacao() {
        String departamento = "";
        for(Membro i:setores) {
	    departamento += i.identificacao() + "\n";
	}
        return departamento;
    }

    public void add(Membro m) {
        this.setores.add(m);
    }

    public void remove(Membro m) {
        this.setores.remove(m);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Membro> getSetores() {
        return setores;
    }
    
    
}
