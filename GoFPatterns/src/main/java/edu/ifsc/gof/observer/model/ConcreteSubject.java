package edu.ifsc.gof.observer.model;

import edu.ifsc.gof.observer.interfaces.Observer;
import edu.ifsc.gof.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers;
    private String message;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }
    @Override
    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException("Null object/Observer");
        if(!observers.contains(observer)) observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }
    public void postMessage(String msg){
        System.out.println("Message posted to my Topic " + msg);
        this.message = msg;
        notifyObservers();
    }
}
