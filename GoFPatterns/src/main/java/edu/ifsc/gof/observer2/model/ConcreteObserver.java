package edu.ifsc.gof.observer2.model;

import edu.ifsc.gof.observer.interfaces.Observer;
import edu.ifsc.gof.observer.interfaces.Subject;
/*
* a listener or observer
* */
public class ConcreteObserver implements Observer {
    private String name;
    //ref to the Subject class
    private Subject topic;
    private int newState;

    public void setNewState(int newState) {
        this.newState = newState;
    }

    public int getNewState() {
        return newState;
    }

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        Object state = topic.getUpdate(this);
        if (state == null) System.out.println(name + " No new message on this topic" );
        else {
            newState = (Integer)state;
            printState();
        } 
            
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
    
    public void printState() {
        System.out.println(name + " New state: "+newState);
    }
}
