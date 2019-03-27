package com.dp.abstractFactory;

import com.dp.abstractFactory.factories.EnemyShipFactory;
import com.dp.abstractFactory.factories.UFOBossEnemyShipFactory;
import com.dp.abstractFactory.factories.UFOEnemyShipFactory;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {
    @Override
    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;
        EnemyShipFactory shipPartsFactory = null;
        if (typeOfShip.equals("UFO")) {
            shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO GRUNT SHIP");
        } else if (typeOfShip.equals("UFO BOSS")) {
            shipPartsFactory = new UFOBossEnemyShipFactory();
            theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO BOSS SHIP");
        }
        return theEnemyShip;
    }

    @Override
    public EnemyShip orderTheShip(String typeOfShip) {
        return super.orderTheShip(typeOfShip);
    }
}
