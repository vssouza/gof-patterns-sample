package br.com.udemy.gof.behavioral.observer.subject;

import java.util.Date;

public abstract class ServerEvent {
    private Date date;

    public ServerEvent() {
        date = new Date();
    }

    public Date getEventTimestamp() {
        return date;
    }

}
