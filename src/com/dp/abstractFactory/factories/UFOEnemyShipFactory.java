package com.dp.abstractFactory.factories;

import com.dp.abstractFactory.ESUFOEngine;
import com.dp.abstractFactory.ESUFOGun;
import com.dp.abstractFactory.ESWeapon;
import com.dp.abstractFactory.EsEngine;

public class UFOEnemyShipFactory implements EnemyShipFactory {
    @Override
    public ESWeapon addESGun() {
        return new ESUFOGun();
    }

    @Override
    public EsEngine addESEngine() {
        return new ESUFOEngine();
    }
}
