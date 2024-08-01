/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsc.com.designpatterns.strategy;

import ifsc.com.designpatterns.strategy.interfaces.InvestStrategy;
import ifsc.com.designpatterns.strategy.model.Context;
import ifsc.com.designpatterns.strategy.strategies.Conservador;

/**
 *
 * @author aluno
 */
public class GoFStrategy {
    
    public static void main(String args[]) {
        Context c = new Context();
        InvestStrategy conservador = new Conservador();
        c.setStrategy(conservador);
        double valorAtualizado = c.executeStrategy(100);
        System.out.println("Valor atualizado: R$" + valorAtualizado);
    }
}
