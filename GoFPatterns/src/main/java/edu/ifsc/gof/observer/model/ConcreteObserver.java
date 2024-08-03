package edu.ifsc.gof.observer.model;

import edu.ifsc.gof.observer.interfaces.Observer;
import edu.ifsc.gof.observer.interfaces.Subject;
/*
* a listener or observer
* */
public class ConcreteObserver implements Observer {
    private String name;
    //ref to the Subject class
    private Subject topic;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg =(String)topic.getUpdate(this);
        if (msg == null) 
            System.out.println(name + " No new message on this topic" );
        else 
            System.out.println(name + " Retrieving message: "+msg);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
