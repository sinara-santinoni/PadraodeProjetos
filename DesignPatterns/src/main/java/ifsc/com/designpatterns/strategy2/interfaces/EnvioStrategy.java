/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsc.com.designpatterns.strategy2.interfaces;

import ifsc.com.designpatterns.strategy.interfaces.*;

/**
 *
 * @author aluno
 */
public interface EnvioStrategy {
    
    String execute(String mensagem);
}
