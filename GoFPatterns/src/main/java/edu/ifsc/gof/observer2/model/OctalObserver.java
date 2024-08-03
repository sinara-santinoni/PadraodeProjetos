package edu.ifsc.gof.observer2.model;

public class OctalObserver extends ConcreteObserver {
    
    public OctalObserver(String name) {
        super(name);
    }
    
    @Override
    public void printState() {
        System.out.println(super.getName() + " New Octal state: "+Integer.toOctalString(super.getNewState()));
    }
    
}
