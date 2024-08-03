package edu.ifsc.gof.strategy2.model;

import edu.ifsc.gof.strategy2.interfaces.MsgStrategy;

public class Comunicado {

    public void enviar(MsgStrategy strategy, String msg) {
        strategy.sendMessage(msg);
    }
    
}
