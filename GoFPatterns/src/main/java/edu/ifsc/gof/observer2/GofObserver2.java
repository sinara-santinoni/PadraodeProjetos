package edu.ifsc.gof.observer2;

import edu.ifsc.gof.observer.interfaces.Observer;
import edu.ifsc.gof.observer2.model.BinaryObserver;
import edu.ifsc.gof.observer2.model.ConcreteObserver;
import edu.ifsc.gof.observer2.model.ConcreteSubject;
import edu.ifsc.gof.observer2.model.HexaObserver;
import edu.ifsc.gof.observer2.model.OctalObserver;

public class GofObserver2 {
    
    public static void main(String[] args) {
        ConcreteSubject topic = new ConcreteSubject();

        //Cria os observers
        Observer firstObserver = new BinaryObserver("First observer");
        Observer secondObserver = new OctalObserver("Second observer");
        Observer thirdObserver = new HexaObserver("Third observer");
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        //linka o observer ao subject
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        //procura por alteracoes
        //firstObserver.update();
        //secondObserver.update();
        //thirdObserver.update();

        // retira um observador e envia uma mensagem
        //topic.unregister(firstObserver);
        topic.postMessage(23);



    }
}
