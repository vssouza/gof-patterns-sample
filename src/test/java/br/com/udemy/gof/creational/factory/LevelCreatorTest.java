package br.com.udemy.gof.creational.factory;

import org.junit.Test;

public class LevelCreatorTest {

    @Test
    public void testElectricTower() {
        LevelFactory.levelFactory(LevelOption.ELECTRIC_TOWER).createScenario();
    }

    @Test
    public void testFrozenPeek() {
        LevelFactory.levelFactory(LevelOption.FROZEN_PEEK).createScenario();

    }
}
