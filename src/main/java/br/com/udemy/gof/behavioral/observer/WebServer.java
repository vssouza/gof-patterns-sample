package br.com.udemy.gof.behavioral.observer;

import br.com.udemy.gof.behavioral.observer.subject.ServerEvent;

public class WebServer implements Server {
    public void notify(ServerEvent event) {
        System.out.println("Web server " + event.getClass().getSimpleName() + " created on " + event.getEventTimestamp());
    }
}
