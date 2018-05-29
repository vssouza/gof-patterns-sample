package br.com.udemy.gof.behavioral.observer;

import br.com.udemy.gof.behavioral.observer.subject.ServerEvent;

public interface Server {

    public void notify(ServerEvent event);

}
