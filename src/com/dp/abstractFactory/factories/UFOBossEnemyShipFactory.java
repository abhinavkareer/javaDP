package com.dp.abstractFactory.factories;

import com.dp.abstractFactory.ESUFOBossEngine;
import com.dp.abstractFactory.ESUFOBossGun;
import com.dp.abstractFactory.ESWeapon;
import com.dp.abstractFactory.EsEngine;

public class UFOBossEnemyShipFactory implements EnemyShipFactory {
    @Override
    public ESWeapon addESGun() {
        return new ESUFOBossGun();
    }

    @Override
    public EsEngine addESEngine() {
        return new ESUFOBossEngine();
    }
}
