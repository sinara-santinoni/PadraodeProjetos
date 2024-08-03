package edu.ifsc.gof.composite1;

import edu.ifsc.gof.composite1.model.Caixa;
import edu.ifsc.gof.composite1.model.Carregador;
import edu.ifsc.gof.composite1.model.Martelo;
import edu.ifsc.gof.composite1.model.Telefone;
import edu.ifsc.gof.composite1.model.FoneOuvido;

public class GofComposite {

    public static void main(String[] args) {
        
        Caixa pedido = new Caixa();
        Caixa c1 = new Caixa();
        Telefone t = new Telefone(1000);
        c1.add(t);
        pedido.add(c1);
        Caixa c2 = new Caixa();
        Carregador c = new Carregador(100);
        c2.add(c);
        Caixa c3 = new Caixa();
        FoneOuvido f = new FoneOuvido(150);
        c3.add(f);
        Caixa c4 = new Caixa();
        c4.add(c2);
        c4.add(c3);
        pedido.add(c4);
        Martelo m = new Martelo(90);
        Caixa c5 = new Caixa();
        c5.add(m);
        pedido.add(c5);
        System.out.println("Total do pedido: " + pedido.execute());
    
    }
}
