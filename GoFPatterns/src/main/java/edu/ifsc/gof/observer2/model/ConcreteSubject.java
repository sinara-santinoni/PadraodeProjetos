package edu.ifsc.gof.observer2.model;

import edu.ifsc.gof.observer.interfaces.Observer;
import edu.ifsc.gof.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers;
    private int state;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }
    public List<Observer> getObservers() {
        return observers;
    }
    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
    public int getMessage() {
        return state;
    }
    public void setMessage(int state) {
        this.state = state;
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
        return this.state;
    }

    public void postMessage(int sta){
        System.out.println("State changed " + sta);
        this.state = sta;
        notifyObservers();
    }
}
