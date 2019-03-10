package com.zzjson.factory.abstr;

import com.zzjson.factory.Car;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2019 shuncom team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : com.zzjson.factory.abstr</li>
 * <li>Version     : 1.0.0</li>
 * <li>Creation    : 2019年03月10日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
public class DefaultFactory extends AbstractFactory {
    private BCCarFactory bcCarFactory = new BCCarFactory();


    @Override
    protected Car getCar() {
        return bcCarFactory.getCar();
    }
}