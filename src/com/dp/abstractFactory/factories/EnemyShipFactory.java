package com.dp.abstractFactory.factories;

import com.dp.abstractFactory.ESWeapon;
import com.dp.abstractFactory.EsEngine;

public interface EnemyShipFactory {
    public ESWeapon addESGun();
    public EsEngine addESEngine();
}
