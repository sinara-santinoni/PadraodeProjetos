package edu.ifsc.gof.strategy1;

import edu.ifsc.gof.strategy1.model.Context;
import edu.ifsc.gof.strategy1.strategies.InvestAudac;
import edu.ifsc.gof.strategy1.strategies.InvestConserv;
import edu.ifsc.gof.strategy1.strategies.InvestModer;

public class GofStrategy {

    public static void main(String[] args) {
        Context context = new Context(new InvestConserv());
        double val = context.executeStrategy(100);
        System.out.println("O retorno do investimento foi " + val);
        context = new Context(new InvestModer());
        val = context.executeStrategy(100);
        System.out.println("O retorno do investimento foi " + val);
        context = new Context(new InvestAudac());
        val = context.executeStrategy(100);
        System.out.println("O retorno do investimento foi " + val);
    }
}