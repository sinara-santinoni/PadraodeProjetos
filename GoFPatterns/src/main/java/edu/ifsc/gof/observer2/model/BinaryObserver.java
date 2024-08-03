package edu.ifsc.gof.observer2.model;

public class BinaryObserver extends ConcreteObserver {
    
    public BinaryObserver(String name) {
        super(name);
    }
    
    @Override
    public void printState() {
        System.out.println(super.getName() + " New Binary state: "+Integer.toBinaryString(super.getNewState()));
    }
}
