package br.com.udemy.gof.behavioral.observer.subject;

import br.com.udemy.gof.behavioral.observer.Server;

import java.util.ArrayList;
import java.util.List;

public class ChangePortSubject {
    private List<Server> changePortServers;

    public ChangePortSubject() {
        changePortServers = new ArrayList<Server>();
    }

    public void registerServer(Server server) {
        changePortServers.add(server);
    }

    public void unregisterServer(Server server) {
        changePortServers.remove(server);
    }

    public void notifyServers() {
        ServerEvent changePortEvent = new ChangePortEvent();
        for(Server server : changePortServers) {
            server.notify(changePortEvent);
        }
    }
}
