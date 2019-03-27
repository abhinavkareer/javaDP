package com.dp.abstractFactory;

import com.dp.abstractFactory.factories.EnemyShipFactory;

public class UFOBossEnemyShip extends EnemyShip{

    EnemyShipFactory shipFactory;

    public UFOBossEnemyShip(EnemyShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    @Override
    void makeShip() {
        weapon=shipFactory.addESGun();
        engine=shipFactory.addESEngine();
        System.out.println("Making enemy ship " + getName());
    }
}
