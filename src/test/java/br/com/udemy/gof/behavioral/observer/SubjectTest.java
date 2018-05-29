package br.com.udemy.gof.behavioral.observer;

import br.com.udemy.gof.behavioral.observer.subject.ChangePortSubject;
import br.com.udemy.gof.behavioral.observer.subject.RestartSubject;
import org.junit.Before;
import org.junit.Test;

public class SubjectTest {

    private ChangePortSubject changePortSubject;
    private RestartSubject restartSubject;

    @Before
    public void setup() {
        changePortSubject = new ChangePortSubject();
        restartSubject = new RestartSubject();
    }

    @Test
    public void testSubjects() {
        EmailServer emailServer = new EmailServer();
        WebServer webServer = new WebServer();
        ProxyServer proxyServer = new ProxyServer();
        changePortSubject.registerServer(emailServer);
        changePortSubject.registerServer(webServer);
        restartSubject.registerServer(proxyServer);
        restartSubject.registerServer(webServer);
        restartSubject.registerServer(emailServer);
        System.out.println("Sending restart event to registered servers:");
        restartSubject.notifyServers();
        System.out.println("\n\nSending change port event to registered servers:");
        changePortSubject.notifyServers();
        System.out.println("\n\nUnregistering Web Server from restart: ");
        restartSubject.unregisterServer(webServer);
        System.out.println("Unregistering Email Server from port change: ");
        changePortSubject.unregisterServer(emailServer);

        System.out.println("\n\nSending restart event to registered servers: ");
        restartSubject.notifyServers();
        System.out.println("\n\nSending port change event to registered servers: ");
        changePortSubject.notifyServers();
    }

}
