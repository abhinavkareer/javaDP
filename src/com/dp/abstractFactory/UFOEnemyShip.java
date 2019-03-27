package com.dp.abstractFactory;

import com.dp.abstractFactory.factories.EnemyShipFactory;

public class UFOEnemyShip extends EnemyShip {
    EnemyShipFactory shipFactory;

    public UFOEnemyShip(EnemyShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    @Override
    void makeShip() {
        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();

        System.out.println("Making enemy ship " + getName());
    }
}
