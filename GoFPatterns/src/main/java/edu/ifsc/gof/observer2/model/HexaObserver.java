package edu.ifsc.gof.observer2.model;

public class HexaObserver extends ConcreteObserver {
    
    public HexaObserver(String name) {
        super(name);
    }
    
    @Override
    public void printState() {
        System.out.println(super.getName() + " New Hexa state: "+Integer.toHexString(super.getNewState()));
    }
}
