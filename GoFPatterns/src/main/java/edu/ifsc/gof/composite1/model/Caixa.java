package edu.ifsc.gof.composite1.model;

import edu.ifsc.gof.composite1.interfaces.Component;
import java.util.ArrayList;
import java.util.List;

public class Caixa implements Component {

    private List<Component> itens = new ArrayList<Component>();
    
    @Override
    public double execute() {
        double total = 0;
        for(Component i:itens) {
	    total += i.execute();
	}
        return total;
    }
    
    public void add(Component c) {
        this.itens.add(c);
    }

    public void remove(Component c) {
        this.itens.remove(c);
    }

}
