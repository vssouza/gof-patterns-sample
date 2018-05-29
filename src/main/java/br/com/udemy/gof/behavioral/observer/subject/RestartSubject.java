package br.com.udemy.gof.behavioral.observer.subject;

import br.com.udemy.gof.behavioral.observer.Server;

import java.util.ArrayList;
import java.util.List;

public class RestartSubject {
    private List<Server> restartPortServers;

    public RestartSubject() {
        restartPortServers = new ArrayList<Server>();
    }

    public void registerServer(Server server) {
        restartPortServers.add(server);
    }

    public void unregisterServer(Server server) {
        restartPortServers.remove(server);
    }

    public void notifyServers() {
        ServerEvent changePortEvent = new ChangePortEvent();
        for(Server server : restartPortServers) {
            server.notify(changePortEvent);
        }
    }


}
