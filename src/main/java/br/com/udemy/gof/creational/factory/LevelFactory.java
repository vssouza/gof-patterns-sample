package br.com.udemy.gof.creational.factory;

import br.com.udemy.gof.creational.factory.level.ElectricTower;
import br.com.udemy.gof.creational.factory.level.FrozenPeek;

public class LevelFactory {

    public static Level levelFactory(LevelOption levelOption) {
        switch (levelOption) {
            case FROZEN_PEEK:
                return new FrozenPeek();
            default:
                return new ElectricTower();
        }
    }
}
