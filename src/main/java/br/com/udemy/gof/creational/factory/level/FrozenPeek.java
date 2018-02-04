package br.com.udemy.gof.creational.factory.level;

import br.com.udemy.gof.creational.factory.Level;

public class FrozenPeek implements Level {

    public void createScenario() {
        System.out.println("Positioning icy mountains.");
        System.out.println("Frozen Peek built.");
    }
}
