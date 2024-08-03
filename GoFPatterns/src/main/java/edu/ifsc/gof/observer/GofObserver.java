package edu.ifsc.gof.observer;

import edu.ifsc.gof.observer.interfaces.Observer;
import edu.ifsc.gof.observer.model.ConcreteObserver;
import edu.ifsc.gof.observer.model.ConcreteSubject;

public class GofObserver {

    public static void main(String[] args) {
        ConcreteSubject topic = new ConcreteSubject();

        //Cria os observers
        Observer firstObserver = new ConcreteObserver("First observer");
        Observer secondObserver = new ConcreteObserver("Second observer");
        Observer thirdObserver = new ConcreteObserver("Third observer");
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        //linka o observer ao subject
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        //procura por alteracoes
        firstObserver.update();
        secondObserver.update();
        thirdObserver.update();

        // retira um observador e envia uma mensagem
        topic.unregister(firstObserver);
        topic.postMessage("hello Subscribers");



    }
}
