package edu.ifsc.gof.strategy1.strategies;

import edu.ifsc.gof.strategy1.interfaces.InvestStrategy;

public class InvestAudac implements InvestStrategy {

    @Override
    public double execute(double quantia) {
        return quantia * 1.05;
    }
    
}
