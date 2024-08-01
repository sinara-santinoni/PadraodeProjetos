/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsc.com.designpatterns.strategy.strategies;

import ifsc.com.designpatterns.strategy.interfaces.InvestStrategy;

/**
 *
 * @author aluno
 */
public class Conservador implements InvestStrategy {

    @Override
    public double execute(double quantia) {
        return (quantia * 1.01);
    }
    
}
