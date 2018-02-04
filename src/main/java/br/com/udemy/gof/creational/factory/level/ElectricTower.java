package br.com.udemy.gof.creational.factory.level;

import br.com.udemy.gof.creational.factory.Level;

public class ElectricTower implements Level {

    public void createScenario() {
        System.out.println("Getting towers ready.");
        System.out.println("Powering structures on");
        System.out.println("Electric Tower built.");
    }
}
