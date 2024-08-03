package edu.ifsc.gof.strategy2.strategies;

import edu.ifsc.gof.strategy2.interfaces.MsgStrategy;

public class SMS implements MsgStrategy {

    @Override
    public void sendMessage(String msg) {
        System.out.println("Enviando comunicado por SMS: " + msg);
    }
    
}
