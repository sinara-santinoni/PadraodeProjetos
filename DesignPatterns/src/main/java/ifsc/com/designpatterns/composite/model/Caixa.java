/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsc.com.designpatterns.composite.model;

import ifsc.com.designpatterns.composite.interfaces.Component;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Caixa implements Component {

    public List<Component> childrens = new ArrayList<Component>();

    public Caixa() {
    }
    
    @Override
    public Double execute() {
        Double valorCaixa = 0.0;
        for (Component children : childrens) {
            valorCaixa = valorCaixa + children.execute();
        }
        return valorCaixa;
    }
    
    public void addChildren(Component children) {
        childrens.add(children);
    }
    
    public void removeChildren(Component children) {
        childrens.remove(children);
    }
    
    public List<Component> getChildrens() {
        return childrens;
    }
}
