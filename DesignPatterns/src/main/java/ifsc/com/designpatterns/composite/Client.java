/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsc.com.designpatterns.composite;

import ifsc.com.designpatterns.composite.interfaces.Component;
import ifsc.com.designpatterns.composite.model.Caixa;
import ifsc.com.designpatterns.composite.model.Carregador;
import ifsc.com.designpatterns.composite.model.FoneDeOuvido;
import ifsc.com.designpatterns.composite.model.Martelo;
import ifsc.com.designpatterns.composite.model.Telefone;

/**
 *
 * @author aluno
 */
public class Client {
    
    public static void main(String args[]) {
        Martelo martelo = new Martelo("Martelo", 10.0);
        Telefone telefone = new Telefone("Telefone", 5.0);
        FoneDeOuvido foneDeOuvido = new FoneDeOuvido("Fone", 5.0);
        Carregador carregador = new Carregador("Carregador", 5.0);
        
        
        Caixa caixaGrande = new Caixa();
        Caixa caixaMedia = new Caixa();
        Caixa caixaPequena1 = new Caixa();
        Caixa caixaPequena2 = new Caixa();
        Caixa caixaPequena3 = new Caixa();
        
        caixaGrande.addChildren(caixaPequena1);
        caixaGrande.addChildren(caixaMedia);
        
        caixaPequena1.addChildren(martelo);
        
        caixaMedia.addChildren(caixaPequena2);
        caixaMedia.addChildren(caixaPequena3);
        
        caixaPequena2.addChildren(telefone);
        caixaPequena2.addChildren(foneDeOuvido);
        
        caixaPequena3.addChildren(carregador);
        
        System.out.println("Valor total: " + caixaGrande.execute());
    }
}
