/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsc.com.designpatterns.strategy.model;

import ifsc.com.designpatterns.strategy.interfaces.InvestStrategy;

/**
 *
 * @author aluno
 */
public class Context {
    
    private InvestStrategy strategy;

    public Context(InvestStrategy strategy) {
        this.strategy = strategy;
    }

    public Context() {
    }

    public void setStrategy(InvestStrategy strategy) {
        this.strategy = strategy;
    }
    
    public double executeStrategy(double v) {
        return strategy.execute(v);
    }
}
