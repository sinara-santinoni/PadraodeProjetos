/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsc.com.designpatterns.strategy2.model;

import ifsc.com.designpatterns.strategy2.interfaces.EnvioStrategy;

/**
 *
 * @author aluno
 */
public class Context {
    
    private EnvioStrategy strategy;

    public Context() {
    }

    public Context(EnvioStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(EnvioStrategy strategy) {
        this.strategy = strategy;
    }

}
